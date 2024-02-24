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
    private String ma,ten,lop;
    private double diem1, diem2, diem3;
    public static int cnt = 0;
    
    public BangDiem(String ma, String ten, String lop, double diem1, double diem2, double diem3){
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    @Override
    public String toString(){
        return String.format("%d %s %s %s %.1f %.1f %.1f", ++cnt, this.ma, this.ten, this.lop, this.diem1, this.diem2, this.diem3);
    }
}
