package org.example.annuaire;

import java.util.ArrayList;
import java.util.List;

public class AnnuaireEntreprise  {

    private List<Entreprise> entreprises =new ArrayList<>();


    public AnnuaireEntreprise(List<Entreprise> entreprises) {
        this.entreprises = entreprises;
    }


    public void ajoutEntreprise(String nom, String numSiret, String adresse, String  siteWeb){
        if(siteWeb.startsWith("www")){
            Entreprise entreprise = new Entreprise(nom, adresse,numSiret, siteWeb);
            this.entreprises.add(entreprise);
        }
    }

    public List<String> showAll(){
        List<String> entreprisesNoms= new ArrayList<>();
        for (int i = 0; i < entreprises.size(); i++){
            entreprisesNoms.add(entreprises.get(i).getNom());
        }
        return entreprisesNoms;
   }

//   public void showOne(int index){
//        //Entreprise entreprise = new Entreprise();
//        if(index < entreprises.size()){
//            System.out.println(this.entreprises.get(index);
//        }
//   }




}
