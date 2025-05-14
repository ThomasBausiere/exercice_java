package org.example.exoPoo.chaise;

public class Chaise {
    private int nombreDePied;
    private String materiaux;
    private String couleurs;

    public Chaise(int nombreDePied, String materiaux, String couleurs) {
        this.nombreDePied = nombreDePied;
        this.materiaux = materiaux;
        this.couleurs = couleurs;
    }

    @Override
    public String toString(){
        return "Chaise {" + '\n'
                + '\t'+"nombre de pieds: "+ nombreDePied +"."+ '\n'
                + '\t'+"Matériaux: "+ materiaux +"."+ '\n'
                + '\t'+"Couleur: "+couleurs +"."+ '\n'
        +'}';
    }
}
