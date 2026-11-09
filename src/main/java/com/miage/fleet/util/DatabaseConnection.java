package com.miage.fleet.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            // Charger le pilote MySQL JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Charger les propriétés depuis src/main/resources/database.properties
            try (InputStream input = DatabaseConnection.class.getClassLoader().getResourceAsStream("database.properties")) {
                if (input == null) {
                    System.err.println("ERREUR : database.properties introuvable dans src/main/resources/");
                } else {
                    Properties prop = new Properties();
                    prop.load(input);
                    url = prop.getProperty("db.url");
                    user = prop.getProperty("db.user");
                    password = prop.getProperty("db.password");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if (url == null) {
            throw new SQLException("Impossible d'établir la connexion : fichier database.properties introuvable ou mal configuré.");
        }
        return DriverManager.getConnection(url, user, password);
    }
}