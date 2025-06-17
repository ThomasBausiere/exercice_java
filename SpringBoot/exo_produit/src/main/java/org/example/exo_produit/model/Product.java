package org.example.exo_produit.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Product {
    private UUID id;
    private String name;
    private String category;
    private double price;
}
