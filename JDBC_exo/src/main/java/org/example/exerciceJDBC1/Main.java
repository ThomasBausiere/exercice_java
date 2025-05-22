package org.example.exerciceJDBC1;

import org.example.exerciceJDBC1.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

import static org.example.exerciceJDBC1.GestionEtudiants.*;

public class Main {

        public static void main(String[] args) {
            int mainMenu;
            Scanner scannerInt = new Scanner(System.in);
            do {
                System.out.println("""
                        Menu:
                    1- Ajouter étudiant
                    2- Afficher l'ensemble des étudiants
                    3- Afficher les étudiants d'une classe
                    4- Supprimer un étudiant
                    0- Quitter
                    """);
                mainMenu = scannerInt.nextInt();
                switch (mainMenu) {
                    case 1:
                        ajoutEtudiant();
                        System.out.println("Etudiant ajouté");
                        break;
                    case 2:
                        afficherEtudiants();
                        System.out.println("ensemble des Etudiants affichés");
                        break;
                    case 3:
                        afficherParClasse();
                        System.out.println("Etudiants de la classe demandée affichés");
                        break;
                    case 4:
                        supprimerEtudiant();
                        System.out.println("Etudiants supprimé");
                        break;
                    case 0:
                        System.out.println("Program ending.");
                        break;
                    default:
                        System.out.println("Incorrect prompt.");
                        break;

                }

            }while (mainMenu!=0);
        }
    }



