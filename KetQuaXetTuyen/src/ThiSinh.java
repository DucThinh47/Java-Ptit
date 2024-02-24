/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class ThiSinh {
    private String ma,ten,dob;
    private double diem_lt, diem_th;
    private int tuoi;
    private double diem_thuong, diem_tong;
    private String loai;
    public static int cnt = 0;
    
    public ThiSinh(String ten, String dob, double diem_lt, double diem_th){
        this.ma = String.format("PH%02d", ++cnt);
        this.ten = ten;
        this.dob = dob;
        this.diem_lt = diem_lt;
        this.diem_th = diem_th;
        this.tuoi = 2021 - Integer.parseInt(dob.substring(6));
        if(diem_lt >= 8.0 && diem_th >= 8.0){
            this.diem_thuong = 1.0;
        }else if(diem_lt >= 7.5 && diem_th >= 7.5){
            this.diem_thuong = 0.5;
        }else{
            this.diem_thuong = 0;
        }
        this.diem_tong = ((diem_lt + diem_th) / 2) + this.diem_thuong;
        if(Math.round(this.diem_tong) > 10){
            this.diem_tong = 10;
        }
        if(Math.round(this.diem_tong) < 5){
            this.loai = "Truot";
        }else if(Math.round(this.diem_tong) >= 5 && Math.round(this.diem_tong) <= 6){
            this.loai = "Trung binh";
        }else if(Math.round(this.diem_tong) == 7){
            this.loai = "Kha";
        }else if(Math.round(this.diem_tong) == 8){
            this.loai = "Gioi";
        }else{
            this.loai = "Xuat sac";
        }
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tuoi + " " + Math.round(this.diem_tong) + " " + this.loai;
    }
    
}
