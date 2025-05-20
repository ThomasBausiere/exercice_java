package org.example.tpPapetterie.model;

import org.example.tpPapetterie.FakeDB;

public class Lot extends Article{

    private int nb, pourcentage;
    private Article article;

    public Lot(String reference, Article refArticle, int nb, int pourcentage ) {
        super(reference);
        this.article = FakeDB.database.get(refArticle);
        this.nb = nb;
        this.pourcentage = pourcentage;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Lot : composé de :"+this.article+" pour un nombre de "+this.nb+" avec une remise de "+this.pourcentage;
    }

    @Override
    public double price(){
        return 0;
    }
}
