package org.example.customer.controller;

import org.example.customer.entity.Customer;
import org.example.customer.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok(customerService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Integer id){
        return ResponseEntity.ok(customerService.getCustomer(id));
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }
}



