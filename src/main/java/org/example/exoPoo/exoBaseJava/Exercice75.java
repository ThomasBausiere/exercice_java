package org.example.exoPoo.exoBaseJava;

import java.util.Scanner;

public class Exercice75 {
    public static void main(String[] args) {
/*
    1. Créer une variable caractere
    2. Affecter une valeur à la variable caractere
    3. Afficher un message en fonction du type du caractère (lettre,
       nombre, ou caractère spécial)
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un caractère");
        char caractere = scanner.nextLine().charAt(0);

        if(Character.isLetterOrDigit(caractere)){
            if(Character.isLetter(caractere)){
                System.out.println("Il s'agit d'une lettre");
            }else{
                System.out.println("Il s'agit d'un chiffre");
            }
        }else {
            System.out.println("Il s'agit d'un caractère special.");
        }
    }
}
