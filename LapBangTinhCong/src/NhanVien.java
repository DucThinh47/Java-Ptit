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
    private String ma,ten;
    private long luong_co_ban;
    private int so_ngay_cong;
    private String chuc_vu;
    private long luong_thang, tien_thuong, phu_cap, thu_nhap;
    public static int cnt = 0;
    
    public NhanVien(String ten, long luong_co_ban, int so_ngay_cong, String chuc_vu){
        this.ma = String.format("NV%02d", ++cnt);
        this.ten = ten;
        this.luong_co_ban = luong_co_ban;
        this.so_ngay_cong = so_ngay_cong;
        this.chuc_vu = chuc_vu;
        this.luong_thang = luong_co_ban * so_ngay_cong;
        if(so_ngay_cong >= 25){
            this.tien_thuong = (this.luong_thang * 20) / 100;
        }else if(so_ngay_cong >= 22 && so_ngay_cong < 25){
            this.tien_thuong = (this.luong_thang * 10) / 100;
        }else{
            this.tien_thuong = 0;
        }
        if(chuc_vu.compareTo("GD") == 0){
            this.phu_cap = 250000;
        }else if(chuc_vu.compareTo("PGD") == 0){
            this.phu_cap = 200000;
        }else if(chuc_vu.compareTo("TP") == 0){
            this.phu_cap = 180000;
        }else{
            this.phu_cap = 150000;
        }
        this.thu_nhap = this.luong_thang + this.tien_thuong + this.phu_cap;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.luong_thang + " " + this.tien_thuong + " " + this.phu_cap + " " + this.thu_nhap;
    }
    
}
