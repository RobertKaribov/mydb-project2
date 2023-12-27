package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String DB_USERNAME = "root123";
    private static final String DB_PASSWORD = "root";

    private static Connection connection = null;
    private static Util instance = null;

    private Util () {
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Util getInstance() {
        if (instance == null) {
            instance = new Util();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}