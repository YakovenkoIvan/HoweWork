package com.company;

import java.sql.*;


public class Service {
    private static final String JDBC_DRIVER = "org.postgresql.Driver";
    private static final String JDBC_DATABASE_URL = "jdbc:postgresql://localhost:5432/";
    private static final String DATABASE_NAME = "Final_Project";
    private static final String JDBC_URL = JDBC_DATABASE_URL + DATABASE_NAME;
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_PASSWORD = "80962820816";


    private static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(JDBC_URL, DATABASE_USER, DATABASE_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(2);
        }
        return conn;
    }

}
