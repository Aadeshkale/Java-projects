package Sample;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connect {
   
    
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    
    
    void connect(String sql){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","");
            ps=con.prepareStatement(sql);
            ps.execute();
            
            
            
        } catch (Exception ex) {
            System.out.println(""+ex);
        }
    
    }
    
    
    
}
