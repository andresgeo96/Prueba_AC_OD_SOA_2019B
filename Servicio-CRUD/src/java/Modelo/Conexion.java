
        
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author usuario
 */
public class Conexion {
    Connection con; 
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:33065/prueba","root","");
        }catch(Exception e){
            
        }
    }
    public Connection getConnection(){
        return con;
    }
    
    
}
