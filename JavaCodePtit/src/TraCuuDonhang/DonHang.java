/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TraCuuDonhang;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class DonHang {
    private String ten, ma;
    private double don_gia, so_luong;
    private String ma_don_hang;
    private double giam, tong;
    private String stt_don_hang;
    
    public DonHang(String ten, String ma, double don_gia, double so_luong){
        this.ten = ten;
        this.ma = ma;
        this.don_gia = don_gia;
        this.so_luong = so_luong;
        this.ma_don_hang = ma.substring(ma.length() - 1);
        this.stt_don_hang = ma.substring(1,4);
        if(this.ma_don_hang.equals("1")){
            this.giam = Math.round(don_gia * so_luong * 50/100);
        }else{
            this.giam = Math.round(don_gia * so_luong * 30/100);
        }
        this.tong = don_gia * so_luong - this.giam;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %.0f %.0f", this.ten, this.ma, this.stt_don_hang, this.giam, this.tong);
    }
}
