/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimThuKhoaKyThi;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class ThiSinh {
    private String ma;
    private String ten, dob;
    private double diem1, diem2, diem3, tong;
    public static int cnt = 0;
    
    public ThiSinh(String ten, String dob, double diem1, double diem2, double diem3){
        this.ma = String.format("%d", ++cnt);
        this.ten = ten;
        this.dob = dob;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tong = diem1 + diem2 + diem3;
    }
    
    public double getTong(){
        return this.tong;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.dob + " " + this.tong;
    }
}
