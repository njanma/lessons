package _9_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App_2_select_all {

    public static void main(String[] args) throws SQLException {
        Connection connection = Utils.getConnection();
        selectByPreparedStatement(connection);
        connection.close();
    }

    private static void selectByPreparedStatement(Connection dbConnection) throws SQLException {
        PreparedStatement preparedStatement = null;

        String selectAll = "SELECT id, name, surname, age from student where student_group = ?";

        try {
            preparedStatement = dbConnection.prepareStatement(selectAll);
            preparedStatement.setInt(1, 1);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                int age = rs.getInt("age");

                System.out.println("id      : " + id);
                System.out.println("name    : " + name);
                System.out.println("surname : " + surname);
                System.out.println("age     : " + age);

                System.out.println("--------------------------");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
}
