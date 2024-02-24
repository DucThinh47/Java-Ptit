/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SinhVien {
    private String ten;
    private String line;
    private int so_bai, so_nop;
    
    public SinhVien(String ten, String line){
        this.ten = ten;
        this.line = line;
        String[] arr = line.trim().split("\\s+");
        //arr = 168 600
        this.so_bai = Integer.parseInt(arr[0]);
        this.so_nop = Integer.parseInt(arr[1]);
    }
    
    public int getSoBai(){
        return this.so_bai;
    }
    
    public int getSoNop(){
        return this.so_nop;
    }
    
    public String getTen(){
        return this.ten;
    }
    
    @Override
    public String toString(){
        return this.ten + " " + this.so_bai + " " + this.so_nop;
    }
}
