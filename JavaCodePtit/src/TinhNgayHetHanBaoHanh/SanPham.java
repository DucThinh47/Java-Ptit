/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhNgayHetHanBaoHanh;

/**
 *
 * @author Duc Thinh
 */
public class SanPham {
   private String IDSP, name;
   
   private int price, countMonths;
   
   public SanPham(String ID, String name, int price, int countMonths){
       this.IDSP = ID;
       this.name = name;
       this.price = price;
       this.countMonths = countMonths;
   }
   
   public int getMonths(){
       return this.countMonths;
   }
   
   public int getPrice(){
       return price;
   }
   
   public String getId(){
       return this.IDSP;
   }
}
