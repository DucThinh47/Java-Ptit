/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SinhVien {
    private String ma,ten,lop,email;
    private String khoa_hoc;
    
    public SinhVien(String ma, String ten, String lop, String email){
        this.ma= ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        //B16D
        this.khoa_hoc = "20" + this.ma.substring(1, 3);
    }
    
    public String getKhoaHoc(){
        return this.khoa_hoc;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}
