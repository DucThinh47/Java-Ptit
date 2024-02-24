/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class LopHoc {
    private String ma,ten_mon,nhom,giang_vien;
    
    public LopHoc(String ma, String ten_mon, String nhom, String giang_vien){
        this.ma = ma;
        this.ten_mon = ten_mon;
        this.nhom = nhom;
        this.giang_vien = giang_vien;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public int getNhom(){
        return Integer.parseInt(this.nhom);
    }
    
    public String getGiangVien(){
        return this.giang_vien;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten_mon + " " + this.nhom;
    }
}
