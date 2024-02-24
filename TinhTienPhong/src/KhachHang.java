/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.util.Date;
import java.time.temporal.ChronoUnit;
public class KhachHang{
    private String ma,ten;
    private String soPhong;
    private Date nhanPhong;
    private Date traPhong;
    private int dichVu;
    private int soNgayO;
    private int tongTien;
    public static int cnt = 0;
    
    public KhachHang(String ten, String soPhong, Date nhanPhong, Date traPhong, int dichVu){
        this.ma = String.format("KH%02d", ++cnt);
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
        this.soPhong = soPhong;
        this.nhanPhong = nhanPhong;
        this.traPhong = traPhong;
        this.dichVu = dichVu;
        this.soNgayO = soNgayO;
        this.tongTien = tongTien;
    }
    public int getSoNgayO(){
        return (int) ChronoUnit.DAYS.between(this.nhanPhong.toInstant(), this.traPhong.toInstant()) + 1;
    }
    public int getTongTien(){
        if(this.soPhong.charAt(0) == '1'){
            return this.getSoNgayO() * 25 + this.dichVu;
        }else if(this.soPhong.charAt(0) == '2'){
            return this.getSoNgayO() * 34 + this.dichVu;
        }else if(this.soPhong.charAt(0) == '3'){
            return this.getSoNgayO() * 50 + this.dichVu;
        }else{
            return this.getSoNgayO() * 80 + this.dichVu;
        }
    }
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.soPhong + " " + this.getSoNgayO() + " " + this.getTongTien();
    }
}