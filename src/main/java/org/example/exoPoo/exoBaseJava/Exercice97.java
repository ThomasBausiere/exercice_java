package org.example.exoPoo.exoBaseJava;

import java.util.Arrays;

public class Exercice97 {
    public static void main(String[] args) {
/*
    1. Ecrire un programme qui permet de vérifier si 2 tableaux sont égaux
    2. Vérifier la taille des tableaux et l'ordre des valeurs
 */

        System.out.println("Début du programme");
        int[] tableau1 = {1, 4, 2, 3};
        int[] tableau2 = {1, 4, 3};
        String answer = (Arrays.equals(tableau1, tableau2)) ? "Les tableaux sont égaux" : "Les tableaux ne sont pas égaux";
        System.out.println(answer);
        System.out.println("Fin du programme");
    }
}
