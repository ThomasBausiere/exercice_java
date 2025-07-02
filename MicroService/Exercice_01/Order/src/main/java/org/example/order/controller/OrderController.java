package org.example.order.controller;

import org.example.order.entity.Customer;
import org.example.order.entity.Order;
import org.example.order.entity.Product;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.example.order.util.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@RestController
@RequestMapping("/order")
public class OrderController {
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable Integer id){
        Order order = new Order();
        order.setId(id);
        order.setDescription(" Sans soupe miso, sauce sucrée");
        Product product= restTemplate.getForObject(
                "http://localhost:8081/product/{id}",
                Product.class,
                id);
        order.setProduct(product);
        Customer customer = restTemplate.getForObject(
                "http://localhost:8082/customer/{id}",
                Customer.class,
                id
        );
        order.setCustomer(customer);
        return order;
    }

    @GetMapping("/detail/{id}")
    public Order getSpecificOrder(@PathVariable Integer id){
        Order order = new Order();
        order.setId(id);
        order.setDescription("Another description");
        RestClient<Product> productRestClient = new RestClient<>("http://localhost:8081/product/"+id);
        Product product = productRestClient.get(Product.class);
        RestClient<Customer> customerRestClient = new RestClient<>("http://localhost:8082/customer/"+id);
        Customer customer = customerRestClient.get(Customer.class);
        order.setProduct(product);
        order.setCustomer(customer);
        return order;
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