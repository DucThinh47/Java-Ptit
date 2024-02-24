/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepDonHang;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class DonHang {
    private String ten_hang, ma_hang;
    private double don_gia, so_luong;
    private String stt;
    private double giam, thanh_tien;
    
    public DonHang(String ten_hang, String ma_hang, double don_gia, double so_luong){
        this.ten_hang = ten_hang;
        this.ma_hang = ma_hang;
        this.don_gia = don_gia;
        this.so_luong = so_luong;
        this.stt = ma_hang.substring(1,4);
        if(ma_hang.charAt(ma_hang.length() -1) == '1'){
            this.giam = Math.round(don_gia * so_luong * 50 / 100);
        }else{
            this.giam = Math.round(don_gia * so_luong * 30 / 100);
        }
        this.thanh_tien = don_gia * so_luong - this.giam;
    }
    
    public int getStt(){
        return Integer.parseInt(this.stt);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %.0f %.0f", this.ten_hang, this.ma_hang , this.stt, this.giam, this.thanh_tien);
    }
}
