package org.example.exercice_meuble.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Furniture {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_furniture")
    private long id;

    private String name;
    private String description;
    private double price;
    private int stock;
}

