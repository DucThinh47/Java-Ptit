/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeSinhVienTheoNganh;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SinhVien {
    private String ma, ten, lop, email;
    private String nganh;
    
    public SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        if(ma.contains("DCKT")){
            this.nganh = "Ke toan";
        }else if(ma.contains("DCCN") && lop.charAt(0) != 'E'){
            this.nganh = "Cong nghe thong tin";
        }else if(ma.contains("DCAT") && lop.charAt(0) != 'E'){
            this.nganh = "An toan thong tin";
        }else if(ma.contains("DCVT")){
            this.nganh = "Vien thong";
        }else{
            this.nganh = "Dien tu";
        }
    }
    
    public String getNganh(){
        return this.nganh;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
    }
}
