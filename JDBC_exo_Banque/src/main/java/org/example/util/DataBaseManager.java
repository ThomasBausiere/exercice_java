package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {

        private final String URI = "jdbc:mysq://localhost:3306/banque";
        private final String USER= "root";
        private final String PASSWORD= "test";

        public Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URI, USER, PASSWORD);
        }
}


