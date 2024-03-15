import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            // Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///KMB", "root", "Kanix@8191");
            s = c.createStatement();
            System.out.println("Database connection established successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
