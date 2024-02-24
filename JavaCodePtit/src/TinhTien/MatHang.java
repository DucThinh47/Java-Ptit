/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTien;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class MatHang {
    private String ma, ten;
    private int so_luong;
    private long don_gia, chiet_khau, thanh_tien;
    
    public MatHang(String ma, String ten, int so_luong, long don_gia, long chiet_khau){
        this.ma = ma;
        this.ten = ten.trim();
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        this.chiet_khau = chiet_khau;
        this.thanh_tien = don_gia * so_luong - chiet_khau;
    }
    
    public long getThanhTien(){
        return this.thanh_tien;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.so_luong + " " + this.don_gia + " " + this.chiet_khau + " " + this.thanh_tien;
    }
}
