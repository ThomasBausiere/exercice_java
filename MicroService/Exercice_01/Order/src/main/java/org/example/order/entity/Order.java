package org.example.order.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private Integer productId;
    private Integer customerId;




    public OrderResponseDto entityToDto(){
        return OrderResponseDto.builder()
                .id(getId())
                .description(getDescription())
                .product(getProductId())
                .customer(getCustomerId())
                .build();
    }


}
