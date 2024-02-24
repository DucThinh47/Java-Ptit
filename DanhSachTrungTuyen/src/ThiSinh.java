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
public class ThiSinh {
    private String ma,ten;
    private double diem_toan, diem_ly, diem_hoa;
    private double diem_uu_tien, diem_tong;
    private String trang_thai;
    
    public ThiSinh(String ma, String ten, double diem_toan, double diem_ly, double diem_hoa){
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
        this.ten = this.ten.trim();
        this.diem_toan = diem_toan;
        this.diem_ly = diem_ly;
        this.diem_hoa = diem_hoa;
        if(this.ma.charAt(2) == '1'){
            this.diem_uu_tien = 0.5;
        }else if(this.ma.charAt(2) == '2'){
            this.diem_uu_tien = 1.0;
        }else{
            this.diem_uu_tien = 2.5;
        }
        this.diem_tong = this.diem_toan * 2 + this.diem_ly + this.diem_hoa + this.diem_uu_tien;
    }
    
    public void setTrangThai(String trang_thai){
        this.trang_thai = trang_thai;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public double getDiemTong(){
        return this.diem_tong;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + (new DecimalFormat().format(this.diem_uu_tien)) + " " + (new DecimalFormat().format(this.diem_tong)) + " " + this.trang_thai;
    }
}
    
