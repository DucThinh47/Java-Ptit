/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import com.entity.User;
public interface UserDAO {
    public boolean userRegister(User us);
    
    public User login(String email, String password);
    
    public boolean checkPassword(int id, String ps);
    
    public boolean updateProfile(User us);
    
    public boolean checkUser(String em);
}
