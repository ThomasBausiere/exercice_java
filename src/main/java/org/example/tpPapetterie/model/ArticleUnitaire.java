package org.example.tpPapetterie.model;

public abstract class ArticleUnitaire extends Article{

    private String nom;
    private double pu;

    public ArticleUnitaire(String reference, String nom, double pu) {
        super(reference);
        this.nom = nom;
        this.pu = pu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPu() {
        return pu;
    }

    public void setPu(double pu) {
        this.pu = pu;
    }

    @Override
    public String toString() {
        return "ArticleUnitaire, réf: " + getReference()+ " nom: "+ getNom()+" de prix"+ getPu();
    }
}
