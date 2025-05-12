package org.example;

import java.util.Scanner;

public class Exercice54 {
    public static void main(String[] args) {
/*
    1. Créer une variable age et lui affecter une valeur
    2. Vérifier si la personne est mineure ou majeure à l'aide des
       opérateurs logiques
    3. Afficher le résultat
    4. /!\ Ne pas utiliser de structure conditionnelle
 */
        System.out.println("Début du programme");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vérfication de votre âge.");
        System.out.println("Veuillez saisir votre âge:");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("Merci pour cette information.");
            System.out.println("Vérification en cours");

            System.out.println("Vous avez l'âge requis. Vous pouvez entrer.");
        }else{
            System.out.println("Merci pour cette information.");
            System.out.println("Vérification en cours");

            System.out.println("Vous êtes trop jeune, vous ne pouvez pas entrer.");
        }

        System.out.println("Fin du programme");
    }
}
