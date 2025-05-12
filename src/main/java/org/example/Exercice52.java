package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercice52 {
    public static void main(String[] args) {
    /*
        1. Écrire un programme qui permet de permuter les valeurs entre
           deux variables
     */
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Saisir a: ");
        a = scanner.nextInt();
        System.out.println("Saisir b:");
        b = scanner.nextInt();
        System.out.println("La valeur de a est: "+a+". La valeur de b est  :"+b);
        System.out.println("Permutation en cours...");
        c=a;
        a=b;
        b=c;
        System.out.println("Permutation terminée");
        System.out.println("La valeur de a est maintenant: "+a+". La valeur de b a été modifiée en :"+b);
        System.out.println("Fin du programme");

    }


}
