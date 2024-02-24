/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDiemTrungBinh;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SinhVien {
    private String ma, ten;
    private double diem1, diem2, diem3;
    private double diemtb;
    private int hang;
    public static int cnt = 0;
    
    public SinhVien(String ten, double diem1, double diem2, double diem3){
        this.ma = String.format("SV%02d", ++cnt);
        this.ten = "";
        String[] arr = ten.trim().split("\\s++");
        for(String x : arr){
            this.ten += x.toUpperCase().charAt(0);
            for(int i=1; i<x.length(); i++){
                this.ten += x.toLowerCase().charAt(i);
            }
            this.ten += " ";
        }
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.diemtb = (diem1 * 3 + diem2 * 3 + diem3 * 2) / 8;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public double getDiemTb(){
        return this.diemtb;
    }
    
    public void setHang(int n){
        this.hang = n;
    }
    
    public int getHang(){
        return this.hang;
    }  
    @Override
    public String toString(){
        return String.format("%s %s %.2f %d", this.ma, this.ten, this.diemtb, this.hang);
    }
}
