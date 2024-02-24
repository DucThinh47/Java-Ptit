/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.sql.Connection;
import java.util.*;
public class UserDAOImpl implements UserDAO {
    private Connection conn;
    
    public UserDAOImpl(Connection conn){
        super();
        this.conn = conn;
    }
    
    public boolean userRegister(User us){
        boolean f = false;
        try{
            String sql = "";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPhno());
            ps.setString(4, us.getPassword());
            
            int i = ps.executeUpdate();
            if(i == 1){
                f = true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public User login(String email, String password){
        User us = null;
        
        try{
            String sql = "select * from user where email=? and password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                us = new User();
                us.setId(rs.getInt(1));
                us.setName(rs.getString(2));
                us.setEmail(rs.getString(3));
                us.setPhno(rs.getString(4));
                rs.setPassword(rs.getString(5));
                rs.setAddress(rs.getString(6));
                rs.setLandmark(rs.getString(7));
                us.setCity(rs.getString(8));
                us.setState(rs.getString(9));
                us.setPincode(rs.getString(10));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return us;
    }
    
    public boolean checkPassword(int id, String ps){
        boolean f = false;
        try{
            String sql = "select * from user where id=? and password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2,ps);
            
            ResulSet rs = pst.executeQuery();
            while(rs.next()){
                f=true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean updateProfile(User us){
        boolean f = false;
        try{
            String sql = "update user set name=?, email=?, phno=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPhno());
            ps.setInt(4, us.getId());
            
            int i = ps.executeUpdate();
            if(i == 1){
                f = true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
    public boolean checkUser(String em){
        boolean f = true;
        
        try{
            String sql = "select * from user where email=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, em);
         
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                f=false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
}
