package ignaapp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class CConnection {
    private static Connection connect = null;
    private static String user = "root";
    private static String password = "root";
    private static String db = "ignaappdb";
    private static String ip = "localhost";
    private static String port = "3306";
    
    String url = "jdbc:mysql://" + ip + ":" + port + "/" + db;

    public CConnection() {
    }
    
    public Connection establishConnection(){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           connect = DriverManager.getConnection(url, user, password);
           if(connect != null){
               JOptionPane.showMessageDialog(null,"Successfuly connected to " + db);
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection failed: " + e.toString());
        }
        return connect;
    }
}
