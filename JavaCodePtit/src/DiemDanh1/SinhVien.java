/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiemDanh1;

/**
 *
 * @author Duc Thinh
 */
public class SinhVien {
   public String ma, ten, lop;
   
   public SinhVien(String ma, String ten, String lop){
       this.ma = ma;
       this.ten = ten;
       this.lop = lop;
   }
   
   public String getMa(){
       return this.ma;
   }
   
   public String getTen(){
       return this.ten;
   }
   
   public String getLop(){
       return this.lop;
   }
}
