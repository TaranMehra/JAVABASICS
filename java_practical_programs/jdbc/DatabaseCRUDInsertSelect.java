import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseCRUDInsertSelect {
    public static void main(String[] args) {
        String url = "localhost:3306/taran";
        String user = "root";
        String password = "password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Connected to the database.");

                // Insert Operation
                String insertSQL = "INSERT INTO employees (name, position, salary) VALUES ('John Doe', 'Manager', 75000)";
                try (Statement statement = connection.createStatement()) {
                    int rowsInserted = statement.executeUpdate(insertSQL);
                    System.out.println("Inserted " + rowsInserted + " row(s).");

                    // Select Operation
                    String selectSQL = "SELECT * FROM employees";
                    ResultSet resultSet = statement.executeQuery(selectSQL);

                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String position = resultSet.getString("position");
                        double salary = resultSet.getDouble("salary");
                        System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Database operation error.");
            e.printStackTrace();
        }
    }
}
