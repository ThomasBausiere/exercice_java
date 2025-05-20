package org.example.tpPapetterie.model;

public abstract class Article {
    private String reference;

    public Article(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    public abstract double price();

}


