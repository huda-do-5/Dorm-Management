/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author ss
 */
public class DBconnection {
     public static Connection getCon(){
           
            java.sql.Connection con = null;
        
            try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/campus_university","root","");
            con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/campus_university","root","");
>>>>>>> e4323d3266e62467ba9bb10a703567939ba107e4
            
        }
        catch(Exception e)
        { 
            System.out.println(e);
           
        }
        return con;    
    
    }
    
}
