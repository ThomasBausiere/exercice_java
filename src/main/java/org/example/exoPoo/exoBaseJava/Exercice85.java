package org.example.exoPoo.exoBaseJava;

import java.util.Scanner;

public class Exercice85 {
    public static void main(String[] args) {
/*
    1. Générer un nombre aléatoire entre 1 et 100
    2. Faire saisir un nombre à l'utilisateur
    3. Si le chiffre saisi est plus grand, écrire : Le nombre est plus petit
    4. Si le chiffre saisi est plus petit, écrire : Le nombre est plus grand
    5. Si le chiffre saisi est égal au chiffre aléatoire, écrire : Vous avez gagné en X
       tentatives
 */ Scanner scanner = new Scanner(System.in);
    int nombreMystere = (int) Math.round(Math.random()* 100) + 1;
    int nbEssai=0;
    while(true){
        System.out.println("Veuillez saisir un nombre");
        int nombreEntre = scanner.nextInt();
        nbEssai++;
        if(nombreEntre == nombreMystere){
            System.out.println("Bravo, vous avez gagné en "+nbEssai+" tentative(s).");
            break;
        }else if(nombreEntre>nombreMystere){
            System.out.println("Le nombre mystère est plus petit !");
        }else{
            System.out.println("Le nombre mystère est plus grand !");
        }
    }
    }
}
