/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangTheoDoiNhapXuatHang;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

public class KhoHang {
    private String ma_hang;
    private double so_luong_nhap;
    private double so_luong_xuat;
    private double don_gia,tien,thue;
    
    public KhoHang(String ma_hang, double so_luong_nhap){
        this.ma_hang = ma_hang;
        this.so_luong_nhap = so_luong_nhap;
        if(ma_hang.charAt(0) == 'A'){
            this.so_luong_xuat = Math.round(so_luong_nhap * 60 / 100);
        }else{
            this.so_luong_xuat = Math.round(so_luong_nhap * 70 / 100);
        }
        if(ma_hang.charAt(ma_hang.length() - 1) == 'Y'){
            this.don_gia = 110000;
        }else{
            this.don_gia = 135000;
        }
        this.tien = this.so_luong_xuat * this.don_gia;
        if(ma_hang.charAt(0) == 'A' && ma_hang.charAt(ma_hang.length()-1) == 'Y'){
            this.thue = Math.round(this.tien * 8 / 100);
        }else if(ma_hang.charAt(0) == 'A' && ma_hang.charAt(ma_hang.length()-1) == 'N'){
            this.thue = Math.round(this.tien * 11 / 100);
        }else if(ma_hang.charAt(0) == 'B' && ma_hang.charAt(ma_hang.length()-1) == 'Y'){
            this.thue = Math.round(this.tien * 17 / 100);
        }else{
            this.thue = Math.round(this.tien * 22 / 100);
        }
    }
    
    @Override
    public String toString(){
        return String.format("%s %.0f %.0f %.0f %.0f %.0f", this.ma_hang, this.so_luong_nhap, this.so_luong_xuat, this.don_gia, this.tien, this.thue);
    }
}
