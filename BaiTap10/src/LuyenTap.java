/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class LuyenTap {
    private String ten, tmp;
    private int bai, sub;
    
    public LuyenTap(String ten, String tmp){
        this.ten = ten;
        this.tmp = tmp;
        String[] s = tmp.split(" ");
        bai = Integer.parseInt(s[0]);
        sub = Integer.parseInt(s[1]);
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public int getSub(){
        return this.sub;
    }
    
    public int getBai(){
        return this.bai;
    }
    
    @Override
    public String toString(){
        return this.ten + " " + this.bai + " " + this.sub;
    }
}
