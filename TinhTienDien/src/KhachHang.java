/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class KhachHang{
    private String ma,ten;
    private char loaiGd;
    private int dau,cuoi,soDien;
    private int tienTrongDm, tienVuotDm, thue, tongTien;
    public static int cnt = 0;
    
    public int getDinhMuc(){
        if(this.loaiGd == 'A'){
            return 100;
        }else if(this.loaiGd == 'B'){
            return 500;
        }else{
            return 200;
        }
    }
    
    public KhachHang(String ten, String info){
        this.ma = String.format("KH%02d", ++cnt);
        this.ten = "";
        String[] arr1 = ten.trim().split("\\s+");
        for(String x : arr1){
            this.ten += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++){
                this.ten += Character.toLowerCase(x.charAt(i));
            }
            this.ten += " ";
        }
        String[] arr2 = info.trim().split("\\s+");
        this.loaiGd = arr2[0].charAt(0);
        this.dau = Integer.parseInt(arr2[1]);
        this.cuoi = Integer.parseInt(arr2[2]);
        this.soDien = this.cuoi - this.dau;
        if(this.soDien < this.getDinhMuc()){
            this.tienTrongDm = this.soDien * 450;
            this.tienVuotDm = 0;
            this.thue = 0;
            this.tongTien = this.tienTrongDm;
        }else{
            this.tienTrongDm = this.getDinhMuc() * 450;
            this.tienVuotDm = (this.soDien - this.getDinhMuc()) * 1000;
            this.thue = this.tienVuotDm * 5 / 100;
            this.tongTien = this.tienTrongDm + this.tienVuotDm + this.thue;
        }
    }
    
    public int getTongTien(){
        return this.tongTien;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tienTrongDm + " " + this.tienVuotDm + " " + this.thue + " " + this.tongTien;
    }
    
}