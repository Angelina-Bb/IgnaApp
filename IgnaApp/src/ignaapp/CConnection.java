package ignaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CConnection {
    protected Connection connect = null;
    protected ResultSet result = null;
    protected Statement stmt = null;
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DB = "ignaappdb";
    private static final String IP = "localhost";
    private static final String PORT = "3306";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    


    protected void establishConnection() throws ClassNotFoundException, SQLException{
        try {
           Class.forName(DRIVER);
           String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DB + "?useSLL=false";
           connect = DriverManager.getConnection(url, USER, PASSWORD);
           if(connect != null){
               JOptionPane.showMessageDialog(null,"Successfuly connected to " + DB);
           }
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }
    
    protected void disconnect() throws Exception{
        try {
            if (result != null){
                result.close();
            }
            if (stmt != null){
                stmt.close();
            }
            if (connect != null){
                connect.close();
            }
        } catch (Exception e){
            throw e;
        }
    }
    
    protected void insertModifyDelete(String sql) throws Exception{
        try {
            establishConnection();
            stmt = connect.createStatement();
            stmt.executeUpdate(sql);                    
        } catch (SQLException | ClassNotFoundException ex) {
            throw ex;
        } finally{
            disconnect();
        }
    }
    
    
}
 