package javaJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnectivivy {
    public static void main( String[] args ) throws SQLException {

        System.out.println("-----****-----MySQL JDBC Connection Testing");

       try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
        } catch ( ClassNotFoundException e ) {
            System.out.println("Where in the world is your MySQL JDBC Driver");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver has been successfully registered");
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javarocks","root", "");
            String sql = "INSERT INTO users Values(3, 'moukaila', 'moukaila@moukaila.com', 'mySecret3')";

            Statement stmt = connection.createStatement();
            stmt.executeUpdate( sql );

            int rows = stmt.getMaxRows();
            if(rows > 0 ) {
                System.out.println(" A new user has been inserted successfully");
            }

            connection.close();

        } catch ( SQLException e) {
            System.out.println("Connection Failed! Please check and try again");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("Success! you can take control of your database");
        } else {
            System.out.println("Failed to make the required connection");
        }
        connection.close();

    }
}



