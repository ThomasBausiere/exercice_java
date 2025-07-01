package org.example.service;

import org.example.entity.Produit;
import org.example.entity.enums.TypeProduit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class ProduitServiceTest {
    private ProduitService produitService;
    private int vD = 1;


    @BeforeEach //avant chaque test, j'instancie ProduitService
    public void updateProduit(){
        produitService = new ProduitService();

    }

    //sellIn nbr de jour avant expiration du produit
    //quality = valeur du produit.
    //vD = vitesse de décrementation

    // apres chaque jour
    // @AfterEach
    // public void updateProduit(produit, vd){
    //  => décrémente SellIn et quality par vD
    // }

    //Les tests de décrémentation:

    // si SellIn = 0 alors vD = vD*2
    @Test
    public void whenSellinEgal0ThenDecrementationDouble() {

        //Arrange
        int vDExpected = vD *2;
        Produit produit = new Produit(
                TypeProduit.LAITIER,
                "ProduitTest",
                20,
                0);

        //Act
        int vDResult=0;
        if(produit.getSellIn() <= 0) {
             vDResult = vD * 2;
        }
        //Assert
        Assert.assertEquals(vDExpected, vDResult);

    }
    //quality >0 !important

//        Produit produitResult = produitService.updateProduct(produit);
//        if(produit.getSellIn()==0){
//            vD= vD*2;
//            produit.setQuality(produit.getQuality()*vD);
//        }
//        produit.setSellIn(produit.getSellIn()*vD);

    //quality < 50 !important
    // quality du produit "brie vieilli" = -vD
    // Quality produit laitier vD*2
}
