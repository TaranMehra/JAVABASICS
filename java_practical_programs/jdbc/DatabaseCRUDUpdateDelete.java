import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCRUDUpdateDelete {
    public static void main(String[] args) {
        String url = "localhost:3306/taran";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Connected to the database.");

                // Update Operation
                String updateSQL = "UPDATE employees SET salary = 80000 WHERE name = 'John Doe'";
                try (Statement statement = connection.createStatement()) {
                    int rowsUpdated = statement.executeUpdate(updateSQL);
                    System.out.println("Updated " + rowsUpdated + " row(s).");
                }

                // Delete Operation
                String deleteSQL = "DELETE FROM employees WHERE name = 'John Doe'";
                try (Statement statement = connection.createStatement()) {
                    int rowsDeleted = statement.executeUpdate(deleteSQL);
                    System.out.println("Deleted " + rowsDeleted + " row(s).");
                }
            }
        } catch (SQLException e) {
            System.out.println("Database operation error.");
            e.printStackTrace();
        }
    }
}
