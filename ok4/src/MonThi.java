/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class MonThi {
    private String ma,ten,hinh_thuc;
    
    public MonThi(String ma, String ten, String hinh_thuc){
        this.ma = ma;
        this.ten = ten;
        this.hinh_thuc = hinh_thuc;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.hinh_thuc;
    }
}
