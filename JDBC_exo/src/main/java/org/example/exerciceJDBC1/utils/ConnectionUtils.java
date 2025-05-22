package org.example.exerciceJDBC1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getSqlConnection() throws SQLException {
        //Preparation pour se connecter à la BDD
        String url ="jdbc:mysql://localhost:3306/etudiant_db";
        String username ="root";
        String password = "test";

        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}
