package org.example.annuaire;

public class Entreprise {
    protected String nom;
    protected String numSiret;
    protected String adresse;
    protected String siteWeb;

    public Entreprise(String siteWeb, String adresse, String numSiret, String nom) {
        this.siteWeb = siteWeb;
        this.adresse = adresse;
        this.numSiret = numSiret;
        this.nom = nom;
    }

    public Entreprise(String nom){

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumSiret() {
        return numSiret;
    }

    public void setNumSiret(String numSiret) {
        this.numSiret = numSiret;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSiteWeb() {
        return siteWeb;
    }

    public void setSiteWeb(String siteWeb) {
        this.siteWeb = siteWeb;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "siteWeb='" + siteWeb + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numSiret='" + numSiret + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}


