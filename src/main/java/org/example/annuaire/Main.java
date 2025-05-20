package org.example.annuaire;

import org.example.annuaire.Entreprise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // AnnuaireEntreprise annuaireEntreprise= new AnnuaireEntreprise("salut", "wwwhello", "test","test");
        Entreprise entreprise1 = new Entreprise("siteweb", "super", "super2" ,"super3");
        Entreprise entreprise2 = new Entreprise("sdzaiteweb", "sudada per", "sdadauper2" ,"su adaper3");

        Scanner scanner = new Scanner(System.in);


        int mainMenu;

        String charName= scanner.nextLine();

        do {
            System.out.println("""
                        Menu:
                    1- Ajouter
                    2- Voir toutes les entreprises
                    3- Voir une entreprise
                    0- Logout
                    """);
            mainMenu = scanner.nextInt();
            switch (mainMenu) {
                case 1:
                    scanner.nextLine();
                    String nom, adresse, siteWeb, numSiret;
                    System.out.println("Veuillez saisir le nom de l'entreprise");
                    nom = scanner.nextLine();
                    System.out.println("Veuillez saisir l'adresse de l'entreprise");
                    adresse = scanner.nextLine();
                    System.out.println("Veuillez saisir le num Siret de l'entreprise");
                    numSiret = scanner.nextLine();
                    System.out.println("Veuillez saisir l'adresse web de l'entreprise");
                    siteWeb = scanner.nextLine();

                    //ajoutEntreprise(nom, adresse, numSiret, siteWeb);
                    break;
                case 2:

                    System.out.println("You successfully did a quest!");
                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Program ending.");
                    break;
                default:
                    System.out.println("Incorrect prompt.");
                    break;

            }

        }while (mainMenu!=0);

    }
}
