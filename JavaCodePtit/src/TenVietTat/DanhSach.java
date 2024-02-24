/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TenVietTat;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class DanhSach {
    private String full_name, first_name,last_name;
    
    public DanhSach(String full_name){
        this.full_name = full_name;//pham duc thinh
        String[] words = full_name.trim().split("\\s++");
        this.first_name = words[words.length - 1];//thinh
        this.last_name = full_name.substring(0, full_name.length() - this.first_name.length());//pham duc
    }
    
    public String getFullName(){
        return this.full_name;
    }
    
    public String getFirstName(){
        return this.first_name;
    }
    
    public String getLastName(){
        return this.last_name;
    }
    
    @Override
    public String toString(){
        return this.full_name;
    }
}
