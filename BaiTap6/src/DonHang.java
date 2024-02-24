/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class DonHang {
    private String ten, ma;
    private long gia, soLuong;
    private long giam, tong;
    private String stt;
    
    public DonHang(String ten, String ma, long gia, long soLuong){
        this.ten = ten;
        this.ma = ma;
        this.gia = gia;
        this.soLuong = soLuong;
    }
    
    public long getGiam(){
        if(this.ma.charAt(this.ma.length()-1) == '2'){
            return gia * soLuong * 30/100;
        }else{
            return gia * soLuong * 50/100;
        }
    }
    
    public long getTong(){
        return this.gia * this.soLuong - this.getGiam();
    }
    
    public String getStt(){
        return this.ma.substring(1,4);
    }
    
    @Override
    public String toString(){
        return this.ten + " " + this.ma + " " + this.getStt() + " " + this.getGiam() + " " + this.getTong();
    }
    
}
