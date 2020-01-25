
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String mensaje; 


    public List listar() {
       List<User> datos = new ArrayList<>();
       String sql = "select * from user";
       try{
           con = conex.getConnection();
           ps= con.prepareStatement(sql);
           rs= ps.executeQuery();
           
           while(rs.next()){
               User u = new User();
               u.setId(rs.getInt("id"));
               u.setFname(rs.getString("fname"));
               u.setLname(rs.getString("lname"));
               datos.add(u);
           }
           
       }catch(Exception e){
           
       }
       return datos;
    }

    public User Listar(int id) {
     String sql = "select * from user where id="+id;
     User user = new User();
        try {
            
             con = conex.getConnection();
           ps= con.prepareStatement(sql);
           rs= ps.executeQuery();
           
           while(rs.next()){
              
               user.setId(rs.getInt("id"));
               user.setFname(rs.getString("fname"));
               user.setLname(rs.getString("lname"));
               
           }
           
            
        } catch (Exception e) {
        }
        return user;
    }


    public String add(String nombre, String ape) {
        
      String sql = "insert into user(fname, lname) values (?,?)";
        try{
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, ape);
            ps.executeUpdate();
            
            if(res==1){
                mensaje = "Usuario Agregado";
            }else{
                mensaje = "Error";
            }
        }catch(Exception e){
            
        }
        return mensaje;
    }

    public String edit(int id, String nombre, String ape) {
     
     String sql = "update user set fname=?, lname=? where id="+id;
     User user = new User();
        try {
           
           con = conex.getConnection();
           ps= con.prepareStatement(sql);
           ps.setString(1, nombre);
           ps.setString(2, ape);
           res= ps.executeUpdate();
           if(res == 1){
               mensaje = "Usiario Actualizado";
           }else{
                mensaje = "Error";
           }

            
        } catch (Exception e) {
        }
        return mensaje;
    
    }

    @Override
    public User delete(int id) {
      String sql = "delete from user where id="+id;
      User user = new User();
        try {
           
           con = conex.getConnection();
           ps= con.prepareStatement(sql);
           res= ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return user;
    }

    @Override
    public String edit(String nombre, String ape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
