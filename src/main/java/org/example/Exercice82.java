package org.example;

import java.util.Scanner;

public class Exercice82 {
    public static void main(String[] args) {
/*
    1. Déclarer une variable nombre
    2. À l'aide de boucles, afficher les suites de nombres qui permettent
       d'arriver au nombre inscrit précédemment
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier");
        int  nombre= scanner.nextInt();

        for (int i=0; i<nombre/2 +1; i++){
            String result = nombre +" = "+ i;
            int somme =i;
            for (int j = i+1; i<nombre ; j++){
                result += "+" +j;
                somme += j;

                if(somme> nombre){
                    break;
                }else if(somme== nombre){
                    System.out.println(result);
                    break;
                }

            }
        }

    }
}
