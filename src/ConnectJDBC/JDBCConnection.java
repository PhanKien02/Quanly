package ConnectJDBC;
import static ConnectJDBC.UserJDBC.conn;
import Module.Product;
import java.sql.Connection;
import java.sql.DriverManager;                                                                      
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 
public class JDBCConnection {
    public static Connection getConnection() {
        String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=QuanLy;";
        String USER_NAME = "sa";
        String PASSWORD = "123456";
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD );
            if(conn != null)
                System.out.println("connect successfully!");
        } 
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println("connect failure!  "+ ex.toString());
        }
        return conn;
    }
}