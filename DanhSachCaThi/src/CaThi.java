/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class CaThi{
    private String ma, ngay, gio, phong;
    public static int cnt = 0;
    public int giay;
    
    public CaThi(String ngay, String gio, String phong){
        this.ma = String.format("C%03d", ++cnt);
        this.ngay = ngay;
        this.gio = gio;
        this.phong = phong;
        this.giay = Integer.parseInt(this.gio.substring(0,2)) * 60 * 60 + Integer.parseInt(this.gio.substring(3)) * 60;
    }
    
    public String getNgay(){
        return this.ngay;
    }
    
    public int getGiay(){
        return this.giay;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ngay + " " + this.gio + " " + this.phong;
    }
}