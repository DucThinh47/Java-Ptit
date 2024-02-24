/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SanPham {
    private String ma, ten, don_vi;
    private int so_luong;
    private double don_gia_nhap, phi_van_chuyen, thanh_tien, gia_ban;
    public static int cnt = 0;
    
    public SanPham(String ten, String don_vi, double don_gia_nhap, int so_luong){
        this.ma = String.format("MH%02d", ++cnt);
        this.ten = ten;
        this.don_vi = don_vi;
        this.don_gia_nhap = don_gia_nhap;
        this.so_luong = so_luong;
        this.phi_van_chuyen = (don_gia_nhap * so_luong) * 5 / 100;
        this.thanh_tien = don_gia_nhap * so_luong + this.phi_van_chuyen;
        this.gia_ban = this.thanh_tien + (this.thanh_tien * 2 / 100); 
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.don_vi + " " + Math.round(this.phi_van_chuyen) + " " + Math.round(this.thanh_tien) + " " + Math.round(this.gia_ban);
    }
}
