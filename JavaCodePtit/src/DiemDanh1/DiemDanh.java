/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiemDanh1;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class DiemDanh {
    public String ma,ten,lop, diem_danh;
//    public int diem_cc;
//    public String ghi_chu;
//    public static int cntx = 0;
//    public int diem_cc;
    
    
    public DiemDanh(String line){
        String[] arr = line.trim().split("\\s++");
        this.ma = arr[0];
        this.diem_danh = arr[1];
    }
    
    public void setTen(String ten){
        this.ten = ten;
    }
    
    public void setLop(String lop){
        this.lop = lop;
    }
    
    public int getDiemCC(){
        int res = 10;
        for(int i=0; i<diem_danh.length(); i++){
            if(diem_danh.charAt(i) == 'm'){
                res -= 1;
            }else if(diem_danh.charAt(i) == 'v'){
                res -= 2;
            }else{
                continue;
            }
        }
        if(res < 0){
            return 0;
        }else{
            return res;
        }
    }
    
    public String getGhiChu(){
        if(this.getDiemCC() == 0){
            return "KDDK";
        }else{
            return "";
        }
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.lop + " " + this.getDiemCC() + " " + this.getGhiChu();
    }
    
}
