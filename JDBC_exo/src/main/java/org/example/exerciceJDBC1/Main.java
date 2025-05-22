package org.example.exerciceJDBC1;

import org.example.exerciceJDBC1.utils.ConnectionUtils;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        try

        {
            connection = ConnectionUtils.getSqlConnection();
            System.out.println("On vient de se connecter à la BDD ");
            System.out.println("Merci de saisir le prénom");
            String nomEtudiant = scanner.nextLine();
            System.out.println("Merci de saisir le nom: ");
            String prenomEtudiant = scanner.nextLine();
            System.out.println("Merci de saisir la date d'obtention du diplome");
            String dateDiplome= scanner.nextLine();
            System.out.println("Merci de saisir le n°de la classe: ");
            int numClasse = scanner.nextInt();

            String request = "INSERT INTO etudiants (nom_etudiant, prenom_etudiant, date_diplome,num_classe) values (?,?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, nomEtudiant);
            preparedStatement.setString(2, prenomEtudiant);
            preparedStatement.setString(3, dateDiplome);
            preparedStatement.setInt(4, numClasse);
            preparedStatement.executeUpdate();


        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
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
