package org.example.exoPoo.exoBaseJava;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice56 {
    public static void main(String[] args) {
/*
    1. Saisir une chaine et la stocker dans une variable
    2. Effectuer les traitements suivants :
    1. Afficher la chaîne en minuscule
    2. Afficher la chaîne en majuscule
    3. Bonus
    1. Convertir la chaîne en tableau puis afficher les caractères séparer d'une virgule
    2. Afficher la première lettre de chaque mot en majuscule
*/
        System.out.println("Début du programme");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modification de l'affichage d'une chaîne de caractères.");
        System.out.println("Veuillez saisir une chaîne de caractères.");
        String phrase = scanner.nextLine();
        String chaineMajuscule = phrase.toUpperCase();
        String chaineMinuscule = phrase.toLowerCase();
        System.out.println("Voici la phrase en minuscule: ");
        System.out.println(chaineMinuscule);
        System.out.println("Voici la phrase en majuscule");
        System.out.println(chaineMajuscule);


        System.out.println("Séparer chaque caractère par une virgule");

        String[] motchaine = phrase.split("");
        System.out.println(Arrays.toString(motchaine));


        System.out.println("Faire passer chaque premier mot en majuscule");
        String[] toMots = phrase.split(" ");
        System.out.println(Arrays.toString(motchaine));





        //char[] phrases= phrase.toCharArray(); //on transforme la chaine en tableau de chaine de caractère
        //for (char lettre : phrases){
         //   System.out.print(lettre+", ");
        //}
        /*
                System.out.println("\n");
        System.out.println("Afficher la premiere lettre en majuscule");
        int i =1;
        if (i=1){

        }
        for (char lettre : phrase.toCharArray()){
            int i =1;
            if(lettre)
        }
         */

        //TODO
        /**
         *  initialiser un compteur a 1 , quand celui ci est à 1 la lettre est en majuscule et le compteur passe à 0, sinon, en minuscule.
         * Le compteur reste à 0 en parcourant le tableau, mais si il tombe sur un espace,  alors le compteur passe a 1 et la prochaine lettre sera en majuscule.
         */

        System.out.println("Fin du programme.");



    }
}
