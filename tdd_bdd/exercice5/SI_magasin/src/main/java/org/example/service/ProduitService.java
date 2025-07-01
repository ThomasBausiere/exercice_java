package org.example.service;

import org.example.entity.Produit;

public class ProduitService {
    private Produit produit;


    public Produit updateProduct(Produit produit){
        int vD = 1;
        if(produit.getSellIn() <= 0 ){
            vD= vD*2;
            produit.setQuality(produit.getQuality()*vD);
        }else{
            produit.setQuality(produit.getQuality()*vD);
        }
        produit.setSellIn(produit.getSellIn()*vD);
        return produit;
    }
}
