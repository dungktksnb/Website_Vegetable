package daos;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {
    public  static Connection getConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/wed_ban_hang";
            String user = "root";
            String pass = "12345678";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,user,pass);
            return connection;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
