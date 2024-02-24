/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class ThiSinh{
    private String ma,ten;
    private double toan, ly, hoa, uuTien, tong;
    private String trangThai;
    
    public ThiSinh(String ma, String ten, double toan, double ly, double hoa){
        this.ma = ma;
        this.ten = "";
        String[] arr = ten.trim().split("\\s+");
        for(String x : arr){
            this.ten += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++){
                this.ten += Character.toLowerCase(x.charAt(i));
            }
            this.ten += " ";
        }
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        if(ma.charAt(2) == '1'){
            this.uuTien = 0.5;
        }else if(ma.charAt(2) == '2'){
            this.uuTien = 1.0;
        }else{
            this.uuTien = 2.5;
        }
        this.tong = this.toan * 2 + this.ly + this.hoa;
        if(this.tong + this.uuTien >= 24){
            this.trangThai = "TRUNG TUYEN";
        }else{
            this.trangThai = "TRUOT";
        }
    }
    
    @Override
     public String toString(){
        if(this.uuTien != (int)this.uuTien && this.tong != (int)this.tong)
        return String.format("%s %s %.1f %.1f %s", this.ma, this.ten, this.uuTien, this.tong, this.trangThai);
        else if(this.uuTien != (int)this.uuTien && this.tong == (int)this.tong)
        return String.format("%s %s %.1f %d %s", this.ma, this.ten, this.uuTien, (int)this.tong, this.trangThai);    
        else if(this.uuTien == (int)this.uuTien && this.tong != (int)this.tong)
        return String.format("%s %s %d %.1f %s", this.ma, this.ten, (int)this.uuTien, this.tong, this.trangThai);
        else 
        return String.format("%s %s %d %d %s", this.ma, this.ten, (int)this.uuTien, (int)this.tong, this.trangThai);
    }
}