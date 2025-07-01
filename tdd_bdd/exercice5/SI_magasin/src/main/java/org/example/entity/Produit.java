package org.example.entity;

import org.example.entity.enums.TypeProduit;

public class Produit {
    private int id;
    private int sellIn ;
    private int quality;
    private String name;
    private TypeProduit typeProduit;


    public Produit(int id, int sellIn, int quality, String name, TypeProduit typeProduit) {
        this.id = id;
        this.sellIn = sellIn;
        this.quality = quality;
        this.name = name;
        this.typeProduit = typeProduit;
    }

    public Produit(TypeProduit typeProduit, String name, int quality, int sellIn) {
        this.typeProduit = typeProduit;
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeProduit getTypeProduit() {
        return typeProduit;
    }

    public void setTypeProduit(TypeProduit typeProduit) {
        this.typeProduit = typeProduit;
    }
}
