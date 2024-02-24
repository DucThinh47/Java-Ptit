/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TuyenDung;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class ThiSinh {
    private String ma ,ten,diem_lt, diem_th;
    public static int cnt = 0;
    
    public ThiSinh(String ten, String diem_lt, String diem_th){
        this.ma = String.format("TS%02d", ++cnt);
        this.ten = ten;
        this.diem_lt = diem_lt;
        this.diem_th = diem_th;
        if(diem_lt.length() >= 2 && diem_lt.compareTo("10") != 0){
            if(diem_lt.charAt(1) != '.'){
                this.diem_lt = diem_lt.charAt(0) + "." + diem_lt.charAt(1);
            }
        }else{
            this.diem_lt = diem_lt;
        }
        if(diem_th.length() >= 2 && diem_th.compareTo("10") != 0){
            if(diem_th.charAt(1) != '.'){
                this.diem_th = diem_th.charAt(0) + "." + diem_th.charAt(1);
            }
        }else{
            this.diem_th = diem_th;
        }
    }
    
    public double getDiemLt(){
        return Double.parseDouble(this.diem_lt);
    }
    
    public double getDiemTh(){
        return Double.parseDouble(this.diem_th);
    }
    
    public double getDiemTb(){
        return (this.getDiemLt() + this.getDiemTh()) / 2;
    }
    
    public String getXepLoai(){
        if(this.getDiemTb() < 5){
            return "TRUOT";
        }else if(this.getDiemTb() > 5 && this.getDiemTb() < 8){
            return "CAN NHAC";
        }else if(this.getDiemTb() >= 8 && this.getDiemTb() <= 9.5){
            return "DAT";
        }else{
            return "XUAT SAC";
        }
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %.2f %s", this.ma, this.ten, this.getDiemTb(), this.getXepLoai());
    }
}
