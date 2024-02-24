/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class DonHang {
    private String ten,ma;
    private int donGia, soLuong;
    private int giamGia, thanhTien;
    
    public DonHang(String ten, String ma, int donGia, int soLuong){
        this.ten = ten;
        this.ma = ma;
        this.donGia = donGia;
        this.soLuong = soLuong; 
    }
    
    public int getGiamGia(){
        if(this.ma.charAt(this.ma.length() - 1) == '1'){
            return this.donGia * 50/100 * this.soLuong;
        }else{
            return this.donGia * 30/100 * this.soLuong;
        }
    }
    
    public int getThanhTien(){
        return this.donGia * this.soLuong - this.getGiamGia();
    }
    
    @Override
    public String toString(){
        return this.ten + " " + this.ma + " " + this.getGiamGia() + " " + this.getThanhTien();
    }
    
}
