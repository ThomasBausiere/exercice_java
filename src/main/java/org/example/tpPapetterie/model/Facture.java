package org.example.tpPapetterie.model;

import org.example.tpPapetterie.FakeDB;

import java.util.Arrays;

public class Facture {
    private String client, date;
    private Ligne[] lignes;
    private int numero;
    private int cpt = 0;

    public Facture(String client, String date, int numero, int nombreLigne) {
        this.client = client;
        this.date = date;
        this.lignes= new Ligne[nombreLigne];
        this.numero = numero;
    }


    public void ajouterLigne(String refArticle, int quantite){

            lignes[cpt++]= new Ligne(FakeDB.database.get(refArticle), quantite);
    }

    public double getPrixTotal(){
        double prixTotal = 0;
        for(int i = 0; i< lignes.length; i++) {
            prixTotal += this.lignes[i].prixTotal();
        }
        return prixTotal;
    }

    @Override
    public String toString() {
        String detaillign = "";
        for(int i=0; i< lignes.length; i++){
            detaillign += "- "+ this.lignes[i].toString()+"total pour cette ligne : " +this.lignes[i].prixTotal()+"\n";
        }
        return "Facture n° " + this.numero +" pour le client: " + this.client+ " à la date "+ this.date+" \n" +detaillign
        +".Prix total de la facture: "+this.getPrixTotal()+"€.";
    }
}
