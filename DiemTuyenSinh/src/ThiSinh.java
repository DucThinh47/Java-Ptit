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
    private String ma,ten,danToc,khuVuc;
    private double diem,uuTien,tongDiem;
    private String trangThai;
    public static int cnt = 0;
    
    public ThiSinh(String ten, double diem, String danToc, String khuVuc){
        this.ma = String.format("TS%02d", ++cnt);
        this.ten = "";
        String[] arr = ten.trim().split("\\s+");
        for(String x : arr){
            this.ten += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++){
                this.ten += Character.toLowerCase(x.charAt(i));
            }
            this.ten += " ";
        }
        this.diem = diem;
        this.danToc = danToc;
        this.khuVuc = khuVuc;
        if(this.khuVuc.charAt(0) == '1'){
            this.uuTien = 1.5;
        }else if(this.khuVuc.charAt(0) == '2'){
            this.uuTien = 1.0;
        }else{
            this.uuTien = 0;
        }
        this.tongDiem = diem + this.uuTien;
        if(this.danToc.toLowerCase().compareTo("kinh") != 0){
            this.tongDiem += 1.5;
        }
        if(this.tongDiem >= 20.5){
            this.trangThai = "Do";
        }else{
            this.trangThai = "Truot";
        }
    }
    
    public double getTongDiem(){
        return this.tongDiem;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %.1f %s", this.ma, this.ten, this.tongDiem, this.trangThai);
    }
}