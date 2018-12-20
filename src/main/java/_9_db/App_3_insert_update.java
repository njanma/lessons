package _9_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App_3_insert_update {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = Utils.getConnection();
        insertAndUpdate(connection);
        connection.close();
    }

    private static void insertAndUpdate(Connection dbConnection) throws SQLException {
        PreparedStatement preparedStatementInsert = null;
        PreparedStatement preparedStatementUpdate = null;
        try {
            String insertTableSQL = "INSERT INTO student_group(title, in_progress)\n" +
                    "VALUES (?,?);";

            String updateTableSQL = "UPDATE student SET student_group =? "
                    + "WHERE id = ?";

            preparedStatementInsert = dbConnection.prepareStatement(insertTableSQL);
            preparedStatementInsert.setString(1, "new group");
            preparedStatementInsert.setBoolean(2, true);
            preparedStatementInsert.execute(); //data COMMITTED into database.

            preparedStatementUpdate = dbConnection.prepareStatement(updateTableSQL);
            preparedStatementUpdate.setInt(1, 999); // unknown id
            preparedStatementUpdate.setInt(2, 1);

            preparedStatementUpdate.executeUpdate(); //student_group=999 is not present in table "student_group".
            //but student group 'new group' was inserted
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
