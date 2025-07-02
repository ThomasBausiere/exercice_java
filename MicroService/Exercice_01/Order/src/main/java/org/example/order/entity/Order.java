package org.example.order.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.order.dto.OrderResponseDto;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name="OrderEntity")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String description;

    @Transient
    private Customer customer;

    @Transient
    private Product product;

    public OrderResponseDto entityToDto(){
        return OrderResponseDto.builder()
                .id(getId())
                .description(getDescription())
                .product(getProduct())
                .customer(getCustomer())
                .build();
    }


}
