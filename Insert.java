import java.sql.*;
import java.util.*;
public class Insert {
    public static void main (String[] args){
        String url = "jdbc:mysql://localhost:3306/ ";
        String user = " root ";
        String password = " @Tanmay089";

        Scanner sc = new Scanner(System.in);

        try {
            // 1. Connect to DB
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL");

            // 2. Take user input
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            // 3. Use PreparedStatement to insert data
            String query = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, name); // first ? replaced by name
            pstmt.setInt(2, age);     // second ? replaced by age

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Student added successfully!");
            }

            // 4. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
