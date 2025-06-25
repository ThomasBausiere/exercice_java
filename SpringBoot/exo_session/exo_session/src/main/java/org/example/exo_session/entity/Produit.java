package org.example.exo_session.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo_session.dto.ProduitResponseDto;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private double price;

    public ProduitResponseDto entityToDto(){
        return ProduitResponseDto.builder()
                .id(getId())
                .name(getName())
                .price(getPrice())
                .build();
    }

}
