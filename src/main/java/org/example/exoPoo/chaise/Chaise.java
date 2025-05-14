package org.example.exoPoo.chaise;

public class Chaise {
    public int nombreDePied;
    public String materiaux;
    public String couleurs;

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
