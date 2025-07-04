package org.example.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.order.entity.Customer;
import org.example.order.entity.Order;
import org.example.order.entity.Product;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderReceiveDto {
    private Integer id;
    private String description;
    private Product product;
    private Customer customer;
}
