package org.example;

import java.util.Scanner;

public class Exercice72 {
    public static void main(String[] args) {
/*
    1. Créer une variable jour de type entier
    2. Affecter une valeur à la variable jour
    3. Afficher le jour de la semaine en lettre en fonction du nombre
       passé
    4. Si le nombre est inférieur à 1 et supérieur à 7, afficher un message
       d'erreur.
 */

        System.out.println("Début du programme");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un chiffre compris entre 1 et 7.");
        int jour =scanner.nextInt();

        switch (jour){
            case 1:
                System.out.println("LUNDI");
                break;
            case 2:
                System.out.println("mardi");
                break;
            case 3:
                System.out.println("mercredi");
                break;
            case 4:
                System.out.println("jeudi");
                break;
            case 5:
                System.out.println("vendredi");
                break;
            case 6:
                System.out.println("samedi");
                break;
            case 7:
                System.out.println("dimanche");
                break;
            default:
                System.out.println("Votre chiffre n'est pas compris entre 1 et 7.");
                break;
        }

        System.out.println("Fin du programme");


    }
}
