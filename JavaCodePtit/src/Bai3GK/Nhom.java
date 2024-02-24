/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3GK;

/**
 *
 * @author Duc Thinh
 */
public class Nhom {
   public static int cnt = 0;
   public String ma_nhom ,ma_mon, ten_mon;
   public int ngay_day;
   public int kip;
   public String ten_gv;
   public String phong;
   
   public Nhom(String ma_mon, int ngay_day, int kip, String ten_gv, String phong){
       this.ma_nhom = String.format("HP%03d", ++cnt);
       this.ma_mon = ma_mon;
       this.ngay_day = ngay_day;
       this.kip = kip;
       this.ten_gv = ten_gv;
       this.phong = phong;
       this.ten_mon = "";
   }

    public static int getCnt() {
        return cnt;
    }

    public String getMa_nhom() {
        return ma_nhom;
    }

    public String getMa_mon() {
        return ma_mon;
    }

    public int getNgay_day() {
        return ngay_day;
    }

    public int getKip() {
        return kip;
    }

    public String getTen_gv() {
        return ten_gv;
    }

    public String getPhong() {
        return phong;
    }
   
    
    public void setTenMon(String s){
        this.ten_mon = s;
    }
    
    public String getTenMon(){
        return this.ten_mon;
    }
    
   
   @Override
   public String toString(){
       return this.ma_nhom + " " + this.getTenMon() + " " + this.ngay_day + " " + this.kip + " " + this.phong;
   }
}
