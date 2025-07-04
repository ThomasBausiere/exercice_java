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
    private final RestTemplate restTemplate;

    public OrderService(OrderRepository orderRepository,RestTemplate restTemplate){
        this.orderRepository = orderRepository;
        this.restTemplate = restTemplate;
    }

    //CREATE
    public OrderResponseDto createOrder(Order order){
        return entityToDto(orderRepository.save(order));
    }
    //READ 1
    public OrderResponseDto getOrderById(Integer id){
        return entityToDto(orderRepository.findById(id).orElseThrow(NotFoundException::new));
    }
    //READ ALL
    public List<OrderResponseDto> getAllOrders(){
        return orderRepository.findAll().stream().map(this::entityToDto).toList();
    }
    //UPDATE

    public OrderResponseDto updateOrder(Integer id, OrderReceiveDto orderReceiveDto){
            Order orderFound = orderRepository.findById(id).orElseThrow(NotFoundException::new);
            Order orderGet = dtoToEntity(orderReceiveDto);
            orderFound.setDescription(orderGet.getDescription());
            orderFound.setProductId(orderGet.getProductId());
            orderFound.setCustomerId(orderGet.getCustomerId());
            return entityToDto(orderRepository.save(orderFound));
    }

    //DELETE
    public boolean deleteOrder(Integer id){
        orderRepository.deleteById(id);
        return true;
    }

    //DtoToEntity
    private Order dtoToEntity(OrderReceiveDto orderReceiveDto){
        RestClient<Product> productRestClient = new RestClient<>("http://PRODUCT/product/"+(orderReceiveDto.getId()), restTemplate);
        RestClient<Customer> customerRestClient = new RestClient<>("http://CUSTOMER/customer/"+(orderReceiveDto.getId()), restTemplate);
        return Order.builder()
                .description(orderReceiveDto.getDescription())
                .productId(productRestClient.get(Product.class).getId())
                .customerId(customerRestClient.get(Customer.class).getId())
                .build();
    }
    //entity to Dto
    public OrderResponseDto entityToDto(Order order) {
        RestClient<Product> productRestClient = new RestClient<>("http://PRODUCT/product/"+(order.getProductId()), restTemplate);
        RestClient<Customer> customerRestClient = new RestClient<>("http://CUSTOMER/customer/"+(order.getProductId()), restTemplate);

        Product product = productRestClient.get(Product.class);
        Customer customer = customerRestClient.get(Customer.class);

        return OrderResponseDto.builder()
                .id(order.getId())
                .description(order.getDescription())
                .product(product)
                .customer(customer)
                .build();

    }
    }