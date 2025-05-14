package org.example.exoPoo.exoBaseJava;

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
        boolean verification = (age >= 18);
        System.out.println("Age: "+ age);
        System.out.println(verification);

        System.out.println("Fin du programme");
    }
}
