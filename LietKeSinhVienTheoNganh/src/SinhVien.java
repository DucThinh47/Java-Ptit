/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SinhVien {
    private String ma, ten, lop, email;
    private String nganh;
    
    public SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.nganh = this.ma.substring(3, 7);
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public String getLop(){
        return this.lop;
    }
    
    public String getNganh(){
        return this.nganh;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}
