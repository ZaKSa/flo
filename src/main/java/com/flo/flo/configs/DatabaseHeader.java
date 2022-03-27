package com.flo.flo.configs;

import java.sql.*;

public class DatabaseHeader extends Configs{
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql//" + dbHost +":" + dbPort +"/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    public void signUpUser(String name_us, String surname_us) {
        String insert = "INSERT INTO";

    }

}
