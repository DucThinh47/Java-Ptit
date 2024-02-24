/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhLuong;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class NhanVien{
    public String ma_nv, ten_nv;
    public int luong_cb, ngay;
//    public int luong_thang;
    public String phong_ban;
    
    public NhanVien(String ma_nv, String ten_nv, int luong_cb, int ngay){
        this.ma_nv = ma_nv;
        this.ten_nv = ten_nv;
        this.luong_cb = luong_cb;
        this.ngay = ngay;
    }
    
    public int getHeSo(){
        if(ma_nv.charAt(0) == 'A'){
            if(1 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 3){
                return 10;
            }else if(4 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 8){
                return 12;
            }else if(9 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 15){
                return 14;
            }else{
                return 20;
            }
        }else if(ma_nv.charAt(0) == 'B'){
            if(1 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 3){
                return 10;
            }else if(4 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 8){
                return 11;
            }else if(9 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 15){
                return 13;
            }else{
                return 26;
            }
        }else if(ma_nv.charAt(0) == 'C'){
            if(1 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 3){
                return 9;
            }else if(4 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 8){
                return 10;
            }else if(9 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 15){
                return 12;
            }else{
                return 14;
            }
        }else{
            if(1 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 3){
                return 8;
            }else if(4 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 8){
                return 9;
            }else if(9 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 15){
                return 11;
            }else{
                return 13;
            }
        }
    }
    
    public String getLuongThang(){
        return Integer.toString(luong_cb * ngay * this.getHeSo()) + "000";
    }
    
    public void setPhongBan(String phong_ban){
        this.phong_ban = phong_ban;
    }
    
    public String getPhongBan(){
        return this.phong_ban;
    }
    
    public String getMaPhong(){
        return ma_nv.substring(3);
    }
    
    @Override
    public String toString(){
        return this.ma_nv + " " + this.ten_nv + " " + this.phong_ban  + this.getLuongThang();
    }
}

