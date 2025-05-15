package org.example.annuaire;

import java.util.ArrayList;
import java.util.List;

public class AnnuaireEntreprise extends Entreprise {

    private List<Entreprise> entreprises =new ArrayList<>();

    public AnnuaireEntreprise(String siteWeb, String adresse, String numSiret, String nom, List<Entreprise> entreprises) {
        super(siteWeb, adresse, numSiret, nom);
        this.entreprises = entreprises;
    }

    public void ajoutEntreprise(Entreprise nomEntreprise){
        entreprises.add(nomEntreprise);
    }

    public void showAll(){
        for (int i = 0; i < entreprises.size(); i++){
            System.out.println( entreprises.get(i).nom);
        }
   }

   public Entreprise showOne(int index){
        return entreprises.get(index);
   }




}
