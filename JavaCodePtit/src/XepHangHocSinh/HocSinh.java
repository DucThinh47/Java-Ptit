/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepHangHocSinh;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class HocSinh implements Comparable<HocSinh>{
    public static int stt = 0;
    public String ten;
    public double diem;
    public int rank;
    
    public HocSinh(String ten, double diem){
        this.ten = ten;
        this.diem = diem;
    }
    
    public String xep_loai(){
        if(diem < 5)
            return "Yeu";
        else if(diem < 7)
            return "Trung binh";
        else if(diem < 9)
            return "Kha";
        else
            return "Gioi";
    }
    
    public void setRank(int rank){
        this.rank = rank;
    }
    
    public int getRank(){
        return rank;
    }
    
    public double getDiem(){
        return this.diem;
    }
    
    @Override
    public int compareTo(HocSinh o){
        if(this.diem < o.diem)
            return 1;
        else
            return -1;
    }
    
    @Override
    public String toString(){
        return String.format("HS%02d %s %.1f %s %d", ++stt, ten,diem,xep_loai(),rank);
    }
}