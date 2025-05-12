package org.example;

import java.util.Scanner;

public class Exercice55 {
    public static void main(String[] args) {
/*
    1. Créer un programme qui permet de calculer le volume d'un cône
    2. La formule est la suivante : 1/3 × π × r² × h
*/
        System.out.println("Début du programme");
        Scanner scanner = new Scanner(System.in);
        double rayon, hauteur, result;
        System.out.println("Calcul du volume d'un cône.");
        System.out.println("Veuillez saisir le rayon");
        rayon = scanner.nextDouble();
        System.out.println("Veuillez saisir la hauteur");
        hauteur = scanner.nextDouble();
        System.out.println("Calcul en cours. . .");
        result =(Math.PI*(Math.pow(rayon, 2))*hauteur)/3;


        System.out.printf("Le volume du cône saisi est de: %, .2f cm3",result);
        System.out.println("Fin du programme.");

    }
}
