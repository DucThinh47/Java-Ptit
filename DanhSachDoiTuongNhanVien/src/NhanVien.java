/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class NhanVien {
    private String ma, ten, gioi_tinh, dob, dia_chi, ma_so_thue, ngay_ky_hd;
    public static int cnt = 0;
    
    public NhanVien(String ten, String gioi_tinh, String dob, String dia_chi, String ma_so_thue, String ngay_ky_hd){
        this.ma = String.format("%05d", ++cnt);
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.dob = dob;
        this.dia_chi = dia_chi;
        this.ma_so_thue = ma_so_thue;
        this.ngay_ky_hd = ngay_ky_hd;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.gioi_tinh + " " + this.dob + " " + this.dia_chi + " " + this.ma_so_thue + " " + this.ngay_ky_hd;
    }
}
