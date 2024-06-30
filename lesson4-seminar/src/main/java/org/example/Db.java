package ru.gb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    public static final String URL = "jdbc:mysql://localhost:3306";
    public static final String USER = "admin";
    public static final String PASSWORD = "password";

    public static void connect() {
//        String driver = "com.mysql.jdbc.Driver";
//        System.setProperty(driver,"");

        try (Connection con = DriverManager.getConnection(URL,USER,PASSWORD)) {

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
