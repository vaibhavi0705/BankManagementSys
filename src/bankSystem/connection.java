package bankSystem;
import java.sql.*;

public class connection {
    Connection con;
    Statement statement;
    public connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/bankSys", "root","root123");
            statement = con.createStatement();
            System.out.println("Database Connected Successfully");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
