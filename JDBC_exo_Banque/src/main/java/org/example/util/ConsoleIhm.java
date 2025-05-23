package org.example.util;

import org.example.service.CustomerService;

import java.util.List;
import java.util.Scanner;

public class ConsoleIhm {
    private static CustomerService customerService = new CustomerService();
    private static Scanner scanner = new Scanner(System.in);

    public static void start() {
        boolean running = true;
        while (running) {
            System.out.println("1. Création de client et compte");
            System.out.println("2. Dépôt");
            System.out.println("3. Retrait");
            System.out.println("4. Afficher compte");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createCustomer();
                    break;
                case 2:
                //    updateUser();
                    break;
                case 3:
                //    deleteUser();
                    break;
                case 4:
                //    displayAllUsers();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Au revoir !");
    }

    private static void createCustomer() {
        System.out.print("Nom  : ");
        String firstName = scanner.nextLine();
        System.out.print("Prenom : ");
        String lastName = scanner.nextLine();
        System.out.print("Numéro de téléphone : ");
        String phone = scanner.nextLine();
        customerService.createCustomer(lastName, firstName, phone);
    }


//    private static void updateUser() {
//        System.out.print("ID de l'utilisateur à modifier : ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//
//        Person person = personService.getPerson(id);
//        if (person == null) {
//            System.out.println("Utilisateur non trouvé !");
//            return;
//        }
//
//        System.out.print("Nouveau nom d'utilisateur : ");
//        String newFirstName = scanner.nextLine();
//        System.out.print("Nouveau prenom : ");
//        String newLastName = scanner.nextLine();
//
//        person.setFirstName(newFirstName);
//        person.setLastName(newLastName);
//
//        personService.updatePerson(person);
//        System.out.println("Utilisateur mis à jour avec succès !");
//    }
//
//    private static void deleteUser() {
//        System.out.print("ID de l'utilisateur à supprimer : ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//
//        personService.deletePerson(id);
//        System.out.println("Utilisateur supprimé avec succès !");
//    }
//
//    private static void displayAllUsers() {
//        List<Person> persons = personService.getAllPerson();
//        for (Person person : persons) {
//            System.out.println(person);
//        }
//    }
}
