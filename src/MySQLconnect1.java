/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class MySQLconnect1 {
    Connection conn=null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/Vroom_Car_Rental","root","123");
            JOptionPane.showMessageDialog(null,"Connected to Database");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
