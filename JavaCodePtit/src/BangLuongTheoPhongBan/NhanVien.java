/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangLuongTheoPhongBan;

/**
 *
 * @author Duc Thinh
 */
public class NhanVien {
   private String ma_nv, ten_nv, ma_phong, ten_phong;
   private int luong_cb, ngay_cong, he_so_nhan, luong_thang;

   public NhanVien(String ma_nv, String ten_nv, int luong_cb, int ngay_cong){
       this.ma_nv = ma_nv;
       this.ten_nv = ten_nv;
       this.luong_cb = luong_cb;
       this.ngay_cong = ngay_cong;
       if(ma_nv.charAt(0) == 'A'){
           if(1 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 3){
                this.he_so_nhan = 10;
           }else if(4 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 8){
               this.he_so_nhan = 12;
           }else if(9 <= Integer.parseInt(ma_nv.substring(1,3)) && Integer.parseInt(ma_nv.substring(1,3)) <= 15){
               this.he_so_nhan = 14;
           }else{
               this.he_so_nhan = 20;
           }
       }else if(ma_nv.charAt(0) == 'B'){
           if (1 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 3) {
               this.he_so_nhan = 10;
           } else if (4 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 8) {
               this.he_so_nhan = 11;
           } else if (9 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 15) {
               this.he_so_nhan = 13;
           } else {
               this.he_so_nhan = 26;
           }
       }else if(ma_nv.charAt(0) == 'C'){
            if (1 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 3) {
               this.he_so_nhan = 9;
           } else if (4 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 8) {
               this.he_so_nhan = 10;
           } else if (9 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 15) {
               this.he_so_nhan = 12;
           } else {
               this.he_so_nhan = 14;
           }
       }else{
           if (1 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 3) {
               this.he_so_nhan = 8;
           } else if (4 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 8) {
               this.he_so_nhan = 9;
           } else if (9 <= Integer.parseInt(ma_nv.substring(1, 3)) && Integer.parseInt(ma_nv.substring(1, 3)) <= 15) {
               this.he_so_nhan = 11;
           } else {
               this.he_so_nhan = 13;
           }
       }
       this.luong_thang = luong_cb * ngay_cong * this.he_so_nhan;
   }
   
   public String getMaPhong(){
       return ma_nv.substring(3);
   }
   
   public void setTenPhong(String s){
       this.ten_phong = s;
   }
   
   public String getTenPhong(){
       return this.ten_phong;
   }
   
   @Override
   public String toString(){
       return this.ma_nv + " " + this.ten_nv + " " + Integer.toString(this.luong_thang) + "000";
   }
}
