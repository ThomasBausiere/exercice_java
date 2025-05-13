package org.example;

import java.util.Scanner;

public class Exercice57 {
    public static void main(String[] args) {
/*
        1. Saisir la longueur du côté du carré et la stocker dans une variable
        2. Calculer l'aire et le périmètre du carré
 */

        System.out.println("Début du programme");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calcul du perimètre et de l'air d'un carré");
        System.out.println("Veuillez saisir la longueur de l'un des côtés");
        double longueur = scanner.nextDouble();
        System.out.println("Calcul de l'air en cours...");
        double air, perimetre;

        air = Math.pow(longueur, 2);
        System.out.println("Calcul terminé.");
        System.out.println("Calcul du périmettre en cours...");

        perimetre = longueur*4;
        System.out.println("Calcul terminé.");
        System.out.println("Calcul du périmètre terminé.");
        System.out.println("Affichage des résultats");
        System.out.printf("L'air d'un carré dont les côtés mesurent %.2fcm est de %.2f cm².Son périmètre est de %.2f cm.", longueur, air, perimetre);

        System.out.println(" \n Fin du programme");

    }
}
