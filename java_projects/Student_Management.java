import java.sql.*;

public class StudentManagement {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "password");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO student VALUES (1, 'John Doe', 85)");
            System.out.println("Student added successfully.");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
