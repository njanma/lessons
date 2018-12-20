package _9_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App_4_transaction {

    public static void main(String[] args) throws SQLException {
        Connection connection = Utils.getConnection();
        transaction(connection);
        connection.close();
    }

    private static void transaction(Connection dbConnection) throws SQLException {
        PreparedStatement preparedStatementInsert = null;
        PreparedStatement preparedStatementUpdate = null;
        try {
            String insertTableSQL = "INSERT INTO student_group(title)\n" +
                    "VALUES (?);";

            String updateTableSQL = "UPDATE student SET student_group =? "
                    + "WHERE id = ?";

            dbConnection.setAutoCommit(false); //transaction block start

            preparedStatementInsert = dbConnection.prepareStatement(insertTableSQL);
            preparedStatementInsert.setString(1, "my new group");
            preparedStatementInsert.execute(); //data COMMITTED into database.

            preparedStatementUpdate = dbConnection.prepareStatement(updateTableSQL);
            preparedStatementUpdate.setInt(1, 99999);
            preparedStatementUpdate.setInt(2, 1);// unknown id

            preparedStatementUpdate.executeUpdate(); //On error rollback, including the first insert statement.
            dbConnection.commit(); //transaction block end
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatementInsert != null) {
                preparedStatementInsert.close();
            }
            if (preparedStatementUpdate != null) {
                preparedStatementUpdate.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
}
