package org.example.annuaire;

import org.example.annuaire.Entreprise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    System.out.println("Veuillez saisir le nom de l'entreprise");
                    String nom = scanner.nextLine();
                    Entreprise entreprise = new Entreprise(nom);
                    Entreprise.ajoutEntreprise(nom);
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
