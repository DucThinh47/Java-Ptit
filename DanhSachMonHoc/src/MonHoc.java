/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.math.*;
public class MonHoc {
    private String ma;
    private String ten;
    private int tc;

    public MonHoc(String ma, String ten, int tc) {
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getTc() {
        return tc;
    }
    
    
    
  
    @Override
    public String toString(){
        return ma + " " + ten + " " + tc;
    }
}
