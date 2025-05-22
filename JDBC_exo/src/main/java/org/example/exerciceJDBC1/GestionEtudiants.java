package org.example.exerciceJDBC1;

import org.example.exerciceJDBC1.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class GestionEtudiants {
    public static void ajoutEtudiant() {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try {
            connection = ConnectionUtils.getSqlConnection();
            System.out.println("On vient de se connecter à la BDD ");
            System.out.println("Merci de saisir le nom de famille");
            String nomEtudiant = scanner.nextLine();
            System.out.println("Merci de saisir le prénom: ");
            String prenomEtudiant = scanner.nextLine();
            System.out.println("Merci de saisir la date d'obtention du diplome");
            String dateDiplome = scanner.nextLine();
            System.out.println("Merci de saisir le n°de la classe: ");
            int numClasse = scanner.nextInt();

            String request = "INSERT INTO etudiants (nom_etudiant, prenom_etudiant, date_diplome,num_classe) values (?,?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nomEtudiant);
            preparedStatement.setString(2, prenomEtudiant);
            preparedStatement.setString(3, dateDiplome);
            preparedStatement.setInt(4, numClasse);
            preparedStatement.executeUpdate();


        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            //fermer la connexion
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void afficherEtudiants() {

        Connection connection = null;
        String request = "SELECT * FROM etudiants";
        try {
            connection = ConnectionUtils.getSqlConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while(resultSet.next()) {
                System.out.print("Nom de l'étudiant:" + resultSet.getString("nom_etudiant"));
                System.out.print("Prénom de l'étudiant:" + resultSet.getString("prenom_etudiant"));
                System.out.print("Diplome obtenu en:" + resultSet.getString("date_diplome"));
                System.out.println("Classe n°" + resultSet.getInt("num_classe"));
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            //fermer la connexion
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void afficherParClasse() {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;

        try {
            connection = ConnectionUtils.getSqlConnection();
            System.out.println("Quelle classe voulait voulez vous afficher?");
            int input =scanner.nextInt();
            String request = "SELECT * FROM etudiants WHERE num_classe = ?";
            PreparedStatement statement = connection.prepareStatement(request);
            statement.setInt(1,input );
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                System.out.print("Nom de l'étudiant:" + resultSet.getString("nom_etudiant"));
                System.out.print("Prénom de l'étudiant:" + resultSet.getString("prenom_etudiant"));
                System.out.print("Diplome obtenu en:" + resultSet.getString("date_diplome"));
                System.out.println("Classe n°" + resultSet.getInt("num_classe"));
                }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            //fermer la connexion
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void supprimerEtudiant() {
            Scanner scanner = new Scanner(System.in);
            Connection connection = null;
            try {
                connection = ConnectionUtils.getSqlConnection();

                System.out.println("Quel est le prénom étudiant voulez vous supprimer de la base de donnée??");
                String inputPrenom =scanner.nextLine();

                System.out.println("Pour confirmer, veuillez entrer son nom de famille.");
                String inputNom =scanner.nextLine();

                String request = "DELETE FROM etudiants WHERE prenom_etudiant = ? AND nom_etudiant = ?";
                PreparedStatement statement = connection.prepareStatement(request);
                statement.setString(1,inputPrenom);
                statement.setString(2,inputNom );
                statement.execute();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                //fermer la connexion
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
    }

}

