import java.sql.*;
import java.util.Scanner;

public class OnlineBookstore {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");

            System.out.println("Available Books:");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " ($" + rs.getDouble(3) + ")");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
