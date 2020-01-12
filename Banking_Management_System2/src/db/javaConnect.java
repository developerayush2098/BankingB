package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {
    Connection conn=null;
    public static Connection connectdb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","incapp");
            return conn;
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
