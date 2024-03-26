package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/schema_name";
    private static final String USER = "root";
    private static final String PASSWORD = "Ver_anna2000";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Соединение с базой данных установлено");
        } catch (SQLException e) {
            System.out.println("Ошибка при установлении соединения с базой данных " + e.getMessage());
        }
        return connection;
    }
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Соединение с базой данных закрыто");
            } catch (SQLException e) {
                System.out.println("Ошибка при закрытии соединения с базой данных " + e.getMessage());
            }
        }
    }
}
