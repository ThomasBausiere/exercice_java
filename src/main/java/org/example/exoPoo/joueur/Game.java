package org.example.exoPoo.joueur;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerAplha = new Scanner(System.in);

        int mainMenu;
        System.out.println("What is your name, hero?");
        String charName= scannerAplha.nextLine();

        Player player1 = new Player(charName);

        do {
            System.out.println("""
                        Menu:
                    1- Fighting
                    2- Do a quest
                    3- Stats
                    0- Logout
                    """);
            mainMenu = scannerInt.nextInt();
            switch (mainMenu) {
                case 1:
                    player1.mobBashing();
                    System.out.println("Enemy Slain !");
                    break;
                case 2:
                    player1.questRewards();
                    System.out.println("You successfully did a quest!");
                    break;
                case 3:
                    System.out.println(player1.toString());
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
