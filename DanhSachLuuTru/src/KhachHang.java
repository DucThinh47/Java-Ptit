/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.util.Date;
public class KhachHang{
    private String ma1, ten , ma2;
    private Date den , di;
    private long tongTg;
    public static int cnt = 0;
    
    public KhachHang(String ten, String ma2, Date den, Date di){
        this.ma1 = String.format("KH%02d", ++cnt);
        this.ten = ten;
        this.ma2 = ma2;
        this.den = den;
        this.di = di;
        this.tongTg = (di.getTime() - den.getTime()) / (1000l * 60 * 60 * 24);
    }
    
    public long getTongTg(){
        return this.tongTg; 
    }
    
    @Override
    public String toString(){
        return this.ma1 + " " + this.ten + " " + this.ma2 + " " + this.tongTg;
    }
}