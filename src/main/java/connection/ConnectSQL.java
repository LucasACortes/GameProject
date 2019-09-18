package connection;


import java.sql.*;

public class ConnectSQL {

    Connection connection = null;

    final String url = "jdbc:mysql://localhost:3306/";
    final String dbName = "tp";
    final String driver = "com.mysql.cj.jdbc.Driver";
    final String userName = "root";
    final String password = "root";


    public Connection connect() {

        try {
            Class.forName(driver).newInstance();
            connection = DriverManager.getConnection(url + dbName, userName, password);

            if (!connection.isClosed()) {
                System.out.println("Database connecton working using TCP/IP...");
            }

        } catch (Exception e) {

            System.err.println("Exception: " + e.getMessage());

        }

        return connection;
    }

    public void disconnect() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
