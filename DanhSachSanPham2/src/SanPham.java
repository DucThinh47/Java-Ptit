/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
class SanPham {
    private String ma,ten;
    private int gia, bh;
    
    public SanPham(String ma, String ten, int gia, int bh){
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.bh = bh;
    }
    
    public int getGia(){
        return this.gia;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.gia + " " + this.bh;
    }
}
