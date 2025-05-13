package org.example;

import java.util.Scanner;

public class Exercice73 {
    public static void main(String[] args) {
/*
    1. Créer une variable mois de type entier
    2. Affecter une valeur à la variable mois
    3. Afficher le nombre de jours du mois
    4. Si le nombre est inférieur à 1 et supérieur à 12, afficher un
       message d'erreur
 */
        System.out.println("Début du programme");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir un chiffre entre 1 et 12.");
        int mois = scanner.nextInt();

        switch (mois){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 jours.");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 jours");
                break;
            case 2:
                System.out.println("28 jours");
                break;
            default:
                System.out.println("Erreur ! Veuillez choisir un chiffre entre 1 et 12 svp !");
                break;
        }
        System.out.println("Fin du programme");
    }
}
