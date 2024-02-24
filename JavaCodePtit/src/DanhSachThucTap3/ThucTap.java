/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachThucTap3;

/**
 *
 * @author Duc Thinh
 */
public class ThucTap {
   public String ma_sv, ma_doanh_nghiep, ten_sv, ten_doanh_nghiep,lop;
   
   public ThucTap(String line){
       String[] arr = line.trim().split("\\s++");
       this.ma_sv = arr[0];
       this.ma_doanh_nghiep = arr[1];
   }
   
   public void setMaSv(String s){
       this.ma_sv = s;
   }
   
   public void setMaDoanhNghiep(String s){
       this.ma_doanh_nghiep = s;
   }

    public String getMa_sv() {
        return ma_sv;
    }
    
    public void setLop(String s){
        this.lop = s;
    }
    
    public void setTenSv(String s){
        this.ten_sv = s;
    }
    
    public void setTenDoanhNghiep(String s){
        this.ten_doanh_nghiep = s;
    }
    
    public String getTenSv(){
        return this.ten_sv;
    }
    
    public String getTenDoanhNghiep(){
        return this.ten_doanh_nghiep;
    }
    
    public String getLop(){
        return this.lop;
    }
    
    public String getMaDoanhNghiep(){
        return this.ma_doanh_nghiep;
    }
   
    @Override
    public String toString(){
        return this.getMa_sv() + " " + this.getTenSv() + " " + this.getLop();
    }
}
