package org.example.customer.service;

import org.example.customer.entity.Customer;
import org.example.customer.exeception.NotFoundException;
import org.example.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){ this.customerRepository= customerRepository;}

    public Customer create (Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Integer id){
        return customerRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }
}
