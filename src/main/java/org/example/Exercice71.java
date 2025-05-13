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
        char caractere;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir un caractère");
        caractere = scanner.nextLine().charAt(0); // pour prendre uniquement le premier caractère saisi par l'utilisateur si celui ci en tape plusieurs
        System.out.println("la lettre retenue est: "+ caractere+".");
        if((caractere== 'a') || (caractere== 'e')||(caractere== 'i')||(caractere=='o' )||(caractere== 'u')||(caractere== 'y')){
            System.out.println("Le caractère est une voyelle");
        }else{
            System.out.println("Le caractère n'est pas une voyelle.");

        }
        System.out.println("Fin du programme");
    }
}
