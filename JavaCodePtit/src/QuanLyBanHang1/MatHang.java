/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang1;

/**
 *
 * @author Duc Thinh
 */
public class MatHang {
    public static int cnt = 0;
    private String ma;
    private String ten;
    private String don_vi;
    private long gia_mua, gia_ban;
    
    public MatHang(String ten, String don_vi, long gia_mua, long gia_ban){
        this.ma = String.format("MH%03d", ++cnt);
        this.ten = ten;
        this.don_vi = don_vi;
        this.gia_mua = gia_mua;
        this.gia_ban = gia_ban;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public String getName(){
        return this.ten;
    }
    
    public String getDonVi(){
        return this.don_vi;
    }
    
    public long getGiaMua(){
        return this.gia_mua;
    }
    
    public long getGiaBan(){
        return this.gia_ban;
    }
}
