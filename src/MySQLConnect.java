
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAHIL
 */
public class MySQLConnect {
    public static Connection connectDB(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","Sahil","sahil123");
            JOptionPane.showMessageDialog(null, "Connection Successfull!", "Connection!", JOptionPane.INFORMATION_MESSAGE);
            return conn;
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull! : " + e.getMessage(), "Connection!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Some Unusual Error Occured! : " + e.getMessage(), "Connection!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
