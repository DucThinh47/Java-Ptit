/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.DecimalFormat;
public class NhanVien {
    private String ma,ten,chuc_vu;
    private int so_ngay_cong;
    private int luong_ngay;
    private int luong_thang, thuong, phu_cap, thuc_linh;
    public static int cnt = 0;
    
    public NhanVien(String ten, int luong_ngay, int so_ngay_cong, String chuc_vu){
        this.ma = String.format("NV%02d", ++cnt);
        this.ten = ten;
        this.luong_ngay = luong_ngay;
        this.so_ngay_cong = so_ngay_cong;
        this.chuc_vu = chuc_vu;
        this.luong_thang = luong_ngay * so_ngay_cong;
        if(so_ngay_cong >= 25){
            this.thuong = this.luong_thang * 20 / 100;
        }else if(so_ngay_cong >= 22){
            this.thuong = this.luong_thang * 10 / 100;
        }else{
            this.thuong = 0;
        }
        if(this.chuc_vu.equals("GD")){
            this.phu_cap = 250000;
        }else if(this.chuc_vu.equals("PGD")){
            this.phu_cap = 200000;
        }else if(this.chuc_vu.equals("TP")){
            this.phu_cap = 180000;
        }else{
            this.phu_cap = 150000;
        }
        this.thuc_linh = this.luong_thang + this.thuong + this.phu_cap;
    }
    
    public int getThucLinh(){
        return this.thuc_linh;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.luong_thang + " " + this.thuong + " " + this.phu_cap + " " + this.thuc_linh;
    }
    
}
