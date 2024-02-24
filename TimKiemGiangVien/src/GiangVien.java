/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class GiangVien {
    private String ma,ten,bo_mon,viet_tat;
    public static int cnt = 0;
    
    public GiangVien(String ten, String bo_mon){
        this.ma = String.format("GV%02d", ++cnt);
        this.ten = ten;
        this.bo_mon = bo_mon;
        String[] arr = bo_mon.trim().split("\\s+");
        this.viet_tat = "";
        for(String x : arr){
            viet_tat += Character.toUpperCase(x.charAt(0));
        }
    }
    
    public String getTen(){
        return this.ten;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.viet_tat;
    }
}
