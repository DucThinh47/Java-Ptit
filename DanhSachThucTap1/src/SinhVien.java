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
    private String ma, ten, lop, email, doanh_nghiep;
    private int stt;
    public static int cnt = 0;
    
    
    public SinhVien(String ma, String ten, String lop, String email, String doanh_nghiep){
        this.stt = ++cnt;
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanh_nghiep = doanh_nghiep;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public String getDoanhNghiep(){
        return this.doanh_nghiep;
    }
    
    @Override
    public String toString(){
        return this.stt + " " + this.ma + " " + this.ten + " " + this.lop + " " + this.email + " " + this.doanh_nghiep;
    }
}
