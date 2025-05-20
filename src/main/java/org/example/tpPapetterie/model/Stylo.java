package org.example.tpPapetterie.model;

public class Stylo extends ArticleUnitaire{
    private String couleur;

    public Stylo(String reference, String nom, double pu, String couleur) {
        super(reference, nom, pu);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Stylo "+super.toString() + " est un stylo de couleur: " + getCouleur();
    }

    @Override
    public double price(){
        return 0;
    }
}
