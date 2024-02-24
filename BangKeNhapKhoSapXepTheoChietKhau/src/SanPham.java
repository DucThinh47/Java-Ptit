/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SanPham {
    private String ma,ten;
    private int so_luong, don_gia;
    private int tien_chiet_khau;
    public static Map<String, Integer> mp = new LinkedHashMap<>();
    
    public static String solve(String s){
        String res = "";
        String[] a = s.trim().split("\\s+");
        for(int i=0; i<2; i++){
            res += a[i].toUpperCase().charAt(0);
        }
        return res;
    }
    
    public SanPham(String ten, int so_luong, int don_gia){
        this.ten = ten;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
        if(mp.containsKey(solve(ten))){
            mp.put(solve(ten), mp.get(solve(ten)) + 1);
        }else{
            mp.put(solve(ten), 1);
        }
        this.ma = solve(ten) + String.format("%02d", mp.get(solve(ten)));
        if(so_luong > 10){
            this.tien_chiet_khau = so_luong * don_gia * 5 / 100;
        }else if(so_luong >= 8 && so_luong <= 10){
            this.tien_chiet_khau = so_luong * don_gia * 2 / 100;
        }else if(so_luong >= 5 && so_luong < 8){
            this.tien_chiet_khau = so_luong * don_gia * 1 / 100;
        }else{
            this.tien_chiet_khau = 0;
        }
    }
    
    public int getChietKhau(){
        return this.tien_chiet_khau;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tien_chiet_khau + " " + (this.so_luong * this.don_gia - this.tien_chiet_khau);
    }
}
