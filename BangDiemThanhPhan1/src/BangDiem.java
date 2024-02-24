/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class BangDiem {
    private String ma, ten, lop;
    private double mon1, mon2, mon3;
    public static int cnt = 0;
    
    public BangDiem(String ma, String ten, String lop, double mon1, double mon2, double mon3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return String.format("%d %s %s %s %.1f %.1f %.1f", ++cnt , this.ma, this.ten, this.lop, this.mon1, this.mon2, this.mon3);
    }
}
