package org.example;

import java.util.Scanner;

public class Exercice71 {
    public static void main(String[] args) {
/*
    1. Créer une variable caractere
    2. Affecter une valeur à la variable caractere
    3. A l'aide des structures conditionnelles, déterminer si le caractère
       est une consonne ou une voyelle
 */
        System.out.println("Début du programme");
        char caractere, test;
        String voyelles= "aeiouy";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un caractère");
        caractere = scanner.nextLine().toLowerCase().charAt(0);

        if(caractere >= 'a' && caractere<= 'z') {
            System.out.println("C'est une lettre");
            if (voyelles.contains(Character.toString(caractere))) {//contains permet de vérifier si les paramètres contenu dans cette methode est contenu dans le string
                System.out.println("Le caractère est une voyelle");
            } else {
                System.out.println("Le caractère est une consonne.");
            }
        }else {
            System.out.println("Ce n'est pas une lettre");
        }

       System.out.println("Fin du programme");
    }
}
