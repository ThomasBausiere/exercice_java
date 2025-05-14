package org.example.exoPoo.exoBaseJava;

import java.util.Arrays;

public class Exercice96 {
    public static void main(String[] args) {
/*
    Ecrire un programme qui permet de trouver la valeur maximale
    dans un tableau

 */

        System.out.println("Début du programme");
        System.out.println("Programme permettant de trouver la valeur maximale d'un tableau");

        int[] tableau ={23, 150, 12, 28, 59, 2};
        System.out.println(Arrays.toString(tableau));
        int max=0;
        for( int i=0;i<tableau.length; i++){
            //boolean isEmpty = (i==0) ? (isEmpty=true): (isEmpty= false);
           // if(isEmpty)
            if(i==0)
            {
                max=tableau[i];
            } else if (max < tableau[i]) {
                max = tableau[i];
            }
        }
        System.out.println(max);

        System.out.println("Fin du programme.");
    }
}
