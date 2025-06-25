package org.example.exo_session.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo_session.entity.Produit;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProduitReceiveDto {

    private String name;
    private double price;

    public Produit dtoToEntity(){
        return Produit.builder()
                .name(getName())
                .price(getPrice())
                .build();
    }
}
