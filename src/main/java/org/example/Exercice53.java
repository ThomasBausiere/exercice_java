package org.example;

import java.util.Scanner;

public class Exercice53 {
    public static void main(String[] args) {
    /*
        1. Écrire un programme avec les variables suivantes : a, b
        2. Afficher la somme des carrés de ces deux nombres
     */
        System.out.println("Début du programme");
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        System.out.println("Début du programme");
        System.out.println("Afficher la somme des carrés de deux nombres");
        System.out.println("Saisir le premier nombre: ");
        a = scanner.nextInt();
        System.out.println("Saisir le deuxième nombre:");
        b = scanner.nextInt();
        System.out.println("Calcul en cours...");
        c= a*a + b*b;
        System.out.println("Calcul terminé.");
        System.out.println("La somme des carrés des nombres que vous avez saisis est: "+c);
        System.out.println("Fin du programme");

    }
}
