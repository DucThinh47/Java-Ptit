/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import static java.lang.Math.round;
public class XetTuyen{
    private String ma,ten,dob;
    private double lt, th;
    private double tong1;
    private long tong2;
    private int tuoi;
    private String loai;
    public static int cnt = 0;
    
    public XetTuyen(String ten, String dob, double lt, double th){
        this.ma = String.format("PH%02d", ++cnt);
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
        this.lt = lt;
        this.th = th;
        this.dob = dob;
        this.tuoi = 2021 - Integer.parseInt(dob.substring(dob.length() - 4));
        this.tong1 = (lt + th) / 2;
        if(this.lt >= 8 && this.th >= 8){
            this.tong1 += 1;
        }else if(this.lt >= 7.5 && this.th >= 7.5){
            this.tong1 += 0.5;
        }
        this.tong2 = Math.round(this.tong1);
        if(this.tong2 > 10)
            this.tong2 = 10;
        if(this.tong2 < 5){
            this.loai = "Truot";
        }else if(this.tong2 == 5 || this.tong2 == 6){
            this.loai = "Trung binh";
        }else if(this.tong2 == 7){
            this.loai = "Kha";
        }else if(this.tong2 == 8){
            this.loai = "Gioi";
        }else{
            this.loai = "Xuat sac";
        }
    }
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tuoi + " " + this.tong2 + " " + this.loai;
    }
}