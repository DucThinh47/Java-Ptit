/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

public class HoTen {
    private String ho_ten, ten;
    
    public String chuanHoa(String s){
        String res = "";
        String[] arr = s.trim().split("\\s+");
        for(String x : arr){
            res += x.toUpperCase().charAt(0) + x.toLowerCase().substring(1) + " ";
        }
        return res.trim();
    }
    
    public String getTen(){
        String[] arr = this.ho_ten.split("\\s+");
        return arr[arr.length - 1];
    }
    
    public String getHoTen(){
        return this.ho_ten;
    }
    
    public HoTen(String ho_ten){
        this.ho_ten = chuanHoa(ho_ten);
        this.ten = getTen();
    }
    @Override
    public String toString(){
        return this.ho_ten;
    }
}
