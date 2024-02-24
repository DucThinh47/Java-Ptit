/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class MatHang {
    private String ma,ten,nhom_hang;
    private double gia_mua, gia_ban;
    private double loi_nhuan;
    public static int cnt = 0;
    
    public MatHang(String ten, String nhom_hang, double gia_mua, double gia_ban){
        this.ma = String.format("%d", ++cnt);
        this.ten = ten;
        this.nhom_hang = nhom_hang;
        this.gia_mua = gia_mua;
        this.gia_ban = gia_ban;
        this.loi_nhuan = gia_ban - gia_mua;
    }
    
    public double getLoiNhuan(){
        return this.loi_nhuan;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %.2f", this.ma, this.ten, this.nhom_hang, this.loi_nhuan);
    }
}
