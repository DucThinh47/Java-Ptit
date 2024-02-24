/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
class MatHang{
    
    public static int cnt = 0;
    private String ma, ten, nhom;
    private double giaMua, giaBan;
    
    
    public MatHang(String ten, String nhom, double giaMua, double giaBan){
        this.ma = String.format("MH%02d", ++cnt);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public double getLoiNhuan(){
        return this.giaBan - this.giaMua;
    }
    
    public void out(){
        System.out.print(this.ma + " " + this.ten + " " + this.nhom + " ");
        System.out.printf("%.2f", this.getLoiNhuan());
    }
}
