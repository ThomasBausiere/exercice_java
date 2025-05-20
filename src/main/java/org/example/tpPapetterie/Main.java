package org.example.tpPapetterie;

import org.example.tpPapetterie.model.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("TP Papeterie !");
        Stylo stylo1 = new Stylo("SY01", "Stylobic", 5.23, "jaune");
        Stylo stylo2 = new Stylo("SY02", "Stylobiz", 1.6, "rouge");

        Ramette ramette1 = new Ramette("RM01", "Stylobic", 12.5, 23);
        Ramette ramette2 = new Ramette("RM02", "Ramette2", 16.6, 80);

        FakeDB.database.put("SY01", stylo1);
        FakeDB.database.put("SY02", stylo2);
        FakeDB.database.put("RM01", ramette1);
        FakeDB.database.put("RM02", ramette2);

//        System.out.println(FakeDB.database.get("SY01"));
//        System.out.println(FakeDB.database.get("SY02"));
//        System.out.println(FakeDB.database.get("RM01"));
//        System.out.println(FakeDB.database.get("RM02"));

//        System.out.println();
//        System.out.println("Tous les elements de ma fausse BDD");
//        System.out.println(FakeDB.database);
//        System.out.println(stylo1);
//        System.out.println(stylo2);
//        System.out.println(ramette1);
//        System.out.println(ramette2);

        System.out.println("Tous les articles de moins de 5€");
        System.out.println(FakeDB.getAllArticleUnitairePriceMax(5));

//        Lot lot = new Lot("LT01", stylo2, 5, 20);
//        Lot lot2 = new Lot("RT02", ramette1, 80, 10);
//
//        System.out.println(lot);
//
//        System.out.println(lot2);
//
        Facture facture = new Facture("toto", "19/05/25", 9991, 2);
//
//
//
        
        facture.ajouterLigne("SY01", 5);
        facture.ajouterLigne("RM01", 3);
        //Article article = new Article("toto");
//
//        System.out.println(facture);

    }




}
