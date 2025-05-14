package org.example.exoPoo.exoBaseJava;

import java.util.Arrays;

public class Exercice95 {
    public static void main(String[] args) {
/*
        1. Déclarer deux tableaux de 10 éléments
        2. Le premier tableau contiendra des nombres négatifs et positifs
        3. Ajouter tous les éléments positifs du premier tableau dans le
           second tableau
*/

        System.out.println("Début du programme");

        int[] tableauSource= {-5, 3, 24, -12, -10, 5, 100, -2, -71, 0};
        int[] tableauDestination=new int[tableauSource.length];

        //on affiche nos tableaux pour une meilleur lisibilité
        System.out.println(Arrays.toString(tableauSource));
        System.out.println(Arrays.toString(tableauDestination));

     //   for (int i=0; i<tableauSource.length; i++){
    //        if(tableauSource[i] >=0){
   //             tableauDestination[i]=tableauSource[i];
  //          }
 //       }
        int compteur = 0;
        for (int valeur: tableauSource){
            if(valeur >0){
                tableauDestination[compteur] = valeur;
                compteur++;
            }
        }

        System.out.println(Arrays.toString(tableauSource));
        System.out.println(Arrays.toString(tableauDestination));
        System.out.println("Fin du programme");


    }
}
