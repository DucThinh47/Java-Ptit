/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class NhanVien {
    private String ma,ten,chuc_vu;
    private int luong_cb, so_ngay_cong,luong_chinh,phu_cap;
    public static int cnt = 0;
    
    public NhanVien(String ten, String chuc_vu, int luong_cb, int so_ngay_cong){
        this.ma = String.format("NV%02d", ++cnt);
        this.ten = ten;
        this.chuc_vu = chuc_vu;
        this.luong_cb = luong_cb;
        this.so_ngay_cong = so_ngay_cong;
        this.luong_chinh = luong_cb * so_ngay_cong;
        if(this.chuc_vu.equals("GD")){
            this.phu_cap = 500;
        }else if(this.chuc_vu.equals("PGD")){
            this.phu_cap = 400;
        }else if(this.chuc_vu.equals("TP")){
            this.phu_cap = 300;
        }else if(this.chuc_vu.equals("KT")){
            this.phu_cap = 250;
        }else{
            this.phu_cap = 100;
        }
    }
    
    public int getThuNhap(){
        return this.luong_chinh + this.phu_cap;
    }
    
    public int getTamUng(){
        double tam_ung = this.phu_cap + this.luong_chinh;
        tam_ung *= 2;
        tam_ung /= 3;
        if(tam_ung < 25000){
            tam_ung = (int)Math.round(tam_ung / 1000) * 1000;
        }else{
            tam_ung = 25000;
        }
        return (int)tam_ung;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " +  this.ten + " " + this.phu_cap + " " + this.luong_chinh + " " + this.getTamUng() + " " + (this.getThuNhap() - this.getTamUng());
    }
}
