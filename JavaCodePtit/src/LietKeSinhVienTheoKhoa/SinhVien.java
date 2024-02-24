/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeSinhVienTheoKhoa;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SinhVien {
    private String ma,ten,lop,email;
    private String khoa;
    
    public SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.khoa = lop.substring(1,3);
    }
    
    public String getKhoa(){
        return this.khoa;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}
