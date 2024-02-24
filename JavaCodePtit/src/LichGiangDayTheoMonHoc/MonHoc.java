/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LichGiangDayTheoMonHoc;

/**
 *
 * @author Duc Thinh
 */
public class MonHoc {
   private String ma_mon, ten_mon;
   private int tin_chi;
   
   public MonHoc(String ma_mon, String ten_mon, int tin_chi){
       this.ma_mon = ma_mon;
       this.ten_mon = ten_mon;
       this.tin_chi = tin_chi;
   }
   
   public String getTenMon(){
       return this.ten_mon;
   }
   
   public String getMaMon(){
       return this.ma_mon;
   }
}
