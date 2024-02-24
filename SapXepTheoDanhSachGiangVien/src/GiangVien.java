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
    private String ma,full_name, last_name ,bo_mon, viet_tat;
    public static int cnt = 0;
    
    public GiangVien(String full_name, String bo_mon){
        this.ma = String.format("GV%02d", ++cnt);
        this.full_name = full_name;
        this.bo_mon = bo_mon;
        String[] arr = full_name.trim().split("\\s+");
        this.last_name = arr[arr.length - 1];
        String[] arr2 = bo_mon.trim().split("\\s+");
        this.viet_tat = "";
        for(String x : arr2){
            this.viet_tat += Character.toUpperCase(x.charAt(0));
        }
    }
    
    public String getLastName(){
        return this.last_name;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.full_name + " " + this.viet_tat;
    }
}
