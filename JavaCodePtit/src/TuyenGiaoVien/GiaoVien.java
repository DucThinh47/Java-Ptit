/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TuyenGiaoVien;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class GiaoVien {
    private String ma_gv, ten_gv, ma_xet;
    private double diem_tin, diem_chuyen;
    private double tong_diem;
    private double diem_uu_tien;
    private String ket_qua;
    private String mon_hoc;
    public static int cnt = 0;
    
    public GiaoVien(String ten_gv, String ma_xet, double diem_tin, double diem_chuyen){
        this.ma_gv = String.format("GV%02d", ++cnt);
        this.ten_gv = ten_gv;
        this.ma_xet = ma_xet;
        this.diem_tin = diem_tin;
        this.diem_chuyen = diem_chuyen;
        if(ma_xet.charAt(1) == '1'){
            this.diem_uu_tien = 2.0;
        }else if(ma_xet.charAt(1) == '2'){
            this.diem_uu_tien = 1.5;
        }else if(ma_xet.charAt(1) == '3'){
            this.diem_uu_tien = 1.0;
        }else{
            this.diem_uu_tien = 0.0;
        }
        if(ma_xet.charAt(0) == 'A'){
            this.mon_hoc = "TOAN";
        }else if(ma_xet.charAt(0) == 'B'){
            this.mon_hoc = "LY";
        }else{
            this.mon_hoc = "HOA";
        }
        this.tong_diem = diem_tin * 2 + diem_chuyen + this.diem_uu_tien;
        if(this.tong_diem >= 18){
            this.ket_qua = "TRUNG TUYEN";
        }else{
            this.ket_qua = "LOAI";
        }
    }
    
    public double getTongDiem(){
        return this.tong_diem;
    }
    
    public String getMaGv(){
        return this.ma_gv;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %.1f %s", this.ma_gv, this.ten_gv, this.mon_hoc, this.tong_diem, this.ket_qua);
    }
}
