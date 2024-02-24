/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class BangDiem{
    private String ma,ten;
    private double diemlt;
    private double diemth;
    private double diemThi;
    private double diemTong;
    private String loai;
    public static int cnt = 0;
    
    public BangDiem(String ten, double diemlt, double diemth, double diemThi){
        this.ma = String.format("SV%02d", ++cnt);
        this.ten = "";
        ten = ten.trim();
        String[] arr = ten.split("\\s+");
        for(String x : arr){
            this.ten += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++){
                this.ten += Character.toLowerCase(x.charAt(i));
            }
            this.ten += " ";
        }
        this.diemlt = diemlt;
        this.diemth = diemth;
        this.diemThi = diemThi;
    }
    
    public double getDiemTong(){
        return (this.diemlt * 25/100) + (this.diemth * 35/100) + (this.diemThi * 40/100);
    }
    
    public String getLoai(){
        if(this.getDiemTong() >= 8.0){
            return "GIOI";
        }else if((this.getDiemTong() >= 6.5) && (this.getDiemTong() < 8.0)){
            return "KHA";
        }else if((this.getDiemTong() >= 5.0) && (this.getDiemTong() < 6.5)){
            return "TRUNG BINH";
        }else{
            return "KEM";
        }
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %.2f %s", this.ma, this.ten, this.getDiemTong(), this.getLoai());
    }
    
}