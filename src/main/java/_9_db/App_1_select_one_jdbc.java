package _9_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App_1_select_one_jdbc {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/example", "postgres", "");
        selectByStatement(connection);
        connection.close();
    }

    private static void selectByStatement(Connection dbConnection) throws SQLException {
        Statement statement = null;

        String selectTableSQL = "SELECT title, in_progress FROM student_group where id = 1";

        try {
            statement = dbConnection.createStatement();

            // execute select SQL statement
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {

                String title = rs.getString("title");
                boolean inProgress = rs.getBoolean("in_progress");

                System.out.println("title : " + title);
                System.out.println("is in progress : " + inProgress);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {

            if (statement != null) {
                statement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }
}
