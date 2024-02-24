/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class HocPhan {
    private String ma_mon, ten_mon, nhom_lop, giang_vien;
    
    public HocPhan(String ma_mon, String ten_mon, String nhom_lop, String giang_vien){
        this.ma_mon = ma_mon;
        this.ten_mon = ten_mon;
        this.nhom_lop = nhom_lop;
        this.giang_vien = giang_vien;
    }
    
    public String getNhomLop(){
        return this.nhom_lop;
    }
    
    public String getTenMon(){
        return this.ten_mon;
    }
    
    public String getMaMon(){
        return this.ma_mon;
    }
    
    @Override
    public String toString(){
        return this.nhom_lop + " " + this.giang_vien;
    }
}
