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
public class HocSinh{
    private String ma, ten, line;
    private double diem_tb;
    private String loai;
    public static int cnt = 0;
    
    public HocSinh(String ten, String line){
        this.ma = String.format("HS%02d", ++cnt);
        this.ten = ten;
        String[] arr = line.split("\\s+");
        this.diem_tb = Double.parseDouble(arr[0]) * 2 + Double.parseDouble(arr[1]) * 2;
        for(int i=2; i<arr.length; i++){
            this.diem_tb += Double.parseDouble(arr[i]);
        }
        this.diem_tb = this.diem_tb / 12;
        if(this.diem_tb >= 9.0){
            this.loai = "XUAT SAC";
        }else if(this.diem_tb >= 8.0 && this.diem_tb <= 8.9){
            this.loai = "GIOI";
        }else if(this.diem_tb >= 7.0 && this.diem_tb <= 7.9){
            this.loai = "KHA";
        }else if(this.diem_tb >= 5.0 && this.diem_tb <= 6.9){
            this.loai = "TB";
        }else{
            this.loai = "YEU";
        }
    }
    
    public double getDiemTb(){
        return this.diem_tb;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + (new DecimalFormat("#0.0").format(this.diem_tb)) + " " + this.loai;
    }
}