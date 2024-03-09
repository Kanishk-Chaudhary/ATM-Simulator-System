import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            String url = System.getenv("DB_URL");
            String user = System.getenv("DB_USER");
            String password = System.getenv("DB_PASSWORD");

            c = DriverManager.getConnection(url, user, password);
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println("Error establishing database connection: " + e);
        }
    }

    public static void main(String[] args) {
        Conn conn = new Conn(); // Instantiating Conn object
    }
}
