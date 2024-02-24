/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class DoanhNghiep {
    private String ma,ten;
    private int so_sinh_vien;
    
    public DoanhNghiep(String ma, String ten, int so_sinh_vien){
        this.ma = ma;
        this.ten = ten;
        this.so_sinh_vien = so_sinh_vien;
    }
    
    public int getSoSinhVien(){
        return this.so_sinh_vien;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.so_sinh_vien;
    }
}
