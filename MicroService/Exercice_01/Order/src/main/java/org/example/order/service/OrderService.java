package org.example.order.service;


import org.example.order.dto.OrderReceiveDto;
import org.example.order.dto.OrderResponseDto;
import org.example.order.entity.Customer;
import org.example.order.entity.Order;
import org.example.order.entity.Product;
import org.example.order.exeception.NotFoundException;
import org.example.order.repository.OrderRepository;
import org.example.order.util.RestClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final RestTemplate restTemplate = new RestTemplate();

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    //CREATE
    public OrderResponseDto createOrder(OrderReceiveDto orderReceiveDto){
        return orderRepository.save(dtoToEntity(orderReceiveDto)).entityToDto();
    }
    //READ 1
    public OrderResponseDto getOneOrder(Integer id){
        return orderRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }
    //READ ALL
    public List<OrderResponseDto> getAllOrders(){
        return orderRepository.findAll().stream().map(Order::entityToDto).toList();
    }
    //UPDATE

    public OrderResponseDto updateOrder(Integer id, OrderReceiveDto orderReceiveDto){
            Order orderFound = orderRepository.findById(id).orElseThrow(NotFoundException::new);
            Order orderGet = dtoToEntity(orderReceiveDto);
            orderFound.setDescription(orderGet.getDescription());
            orderFound.setProduct(orderGet.getProduct());
            orderFound.setCustomer(orderGet.getCustomer());
            return orderRepository.save(orderFound).entityToDto();
    }

    //DELETE
    public boolean deleteOrder(Integer id){
        orderRepository.deleteById(id);
        return true;
    }

    //DtoToEntity
    private Order dtoToEntity(OrderReceiveDto orderReceiveDto){
        RestClient<Product> productRestClient = new RestClient<>("http://localhost:8081/product/"+(orderReceiveDto.getId()));
        RestClient<Customer> customerRestClient = new RestClient<>("http://localhost:8082/customer/"+(orderReceiveDto.getId()));
        return Order.builder()
                .description(orderReceiveDto.getDescription())
                .product(productRestClient.get(Product.class))
                .customer(customerRestClient.get(Customer.class))
                .build();
    }



}
