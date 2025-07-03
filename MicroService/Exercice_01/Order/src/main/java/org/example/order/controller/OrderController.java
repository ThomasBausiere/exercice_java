package org.example.order.controller;

import org.example.order.dto.OrderReceiveDto;
import org.example.order.dto.OrderResponseDto;
import org.example.order.entity.Customer;
import org.example.order.entity.Order;
import org.example.order.entity.Product;
import org.example.order.service.OrderService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.example.order.util.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@RestController
@RequestMapping("/order")
public class OrderController {
    private final RestTemplate restTemplate = new RestTemplate();
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{id}")
    public OrderResponseDto getOrder(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

    @PostMapping
    public ResponseEntity<OrderReceiveDto> create(@RequestBody OrderReceiveDto orderReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(orderReceiveDto);
    }


}


//@RestController
/// /@RequestMapping("/personne")
/// /public class PersonneController {
/// /
/// /    private final RestTemplate restTemplate = new RestTemplate();
/// /
/// /
/// /    @GetMapping("/{id}")
/// /    public Personne getPersonne(@PathVariable int id){
/// /        Personne personne = new Personne();
/// /        personne.setId(id);
/// /        personne.setName("Toto");
/// /        Adresse adresse = restTemplate.getForObject(
/// /          "http://localhost:8080/adresse/{id}",
/// /            Adresse.class,
/// /            id
/// /        );
/// /        personne.setAdresse(adresse);
/// /        return personne;
/// /    }


/// /    @GetMapping("/detail/{id}")
/// /    public Personne getPeople(@PathVariable int id){
/// /        Personne personne = new Personne();
/// /        personne.setId(id);
/// /        personne.setName("Tota");
/// /        RestClient<Adresse> adresseRestClient = new RestClient<>("http://localhost:8080/adresse/"+id);
/// /        Adresse adresse = adresseRestClient.get(Adresse.class);
/// /        personne.setAdresse(adresse);
/// /        return personne;
/// /    }
/// /}