/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauLacBoBongDa1;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class CLB{
    private String ma,ten;
    private int gia_ve;
    
    public CLB(String ma, String ten, int gia_ve){
        this.ma = ma;
        this.ten = ten;
        this.gia_ve = gia_ve;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getGia_ve() {
        return gia_ve;
    }
}