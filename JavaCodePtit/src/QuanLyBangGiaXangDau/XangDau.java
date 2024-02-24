/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBangGiaXangDau;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class XangDau {
    private String ma;
    private double so_luong;
    private String hang_sx;
    private double don_gia,thue,thanh_tien;
    
    public XangDau(String line){
        String[] arr = line.trim().split("\\s++");
        this.ma = arr[0];
        this.so_luong = Double.parseDouble(arr[1]);
        if(ma.charAt(0) == 'X'){
            this.don_gia = 128000;
            this.thue = Math.round(this.don_gia * so_luong * 3 / 100);
        }else if(ma.charAt(0) == 'D'){
            this.don_gia = 11200;
            this.thue = Math.round(this.don_gia * so_luong * 3.5 / 100);
        }else{
            this.don_gia = 9700;
            this.thue = Math.round(this.don_gia * so_luong * 2 / 100);
        }
        if(ma.substring(3).equals("TN")){
            this.thue = 0;
            this.hang_sx = "Trong nuoc";
        }else if(ma.substring(3).equals("BP")){
            this.hang_sx = "British Petro";
        }else if(ma.substring(3).equals("ES")){
            this.hang_sx = "Esso";
        }else if(ma.substring(3).equals("SH")){
            this.hang_sx = "Shell";
        }else if(ma.substring(3).equals("CA")){
            this.hang_sx = "Castrol";
        }else{
            this.hang_sx = "Mobil";
        }
        this.thanh_tien = this.don_gia * this.so_luong + this.thue;
    }
    
    public double getThanhTien(){
        return this.thanh_tien;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %.0f %.0f %.0f", this.ma, this.hang_sx,this.don_gia, this.thue, this.thanh_tien);
    }
}
