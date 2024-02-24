/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.math.*;
import java.lang.*;
class GiaoVien {
    private String mgv;
    private String ten;
    private long luongcb;
    
    public GiaoVien(Scanner sc){
        this.mgv = sc.nextLine();
        this.ten = sc.nextLine();
        this.luongcb = sc.nextLong();
    }
    
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setMgv(String mgv){
        this.mgv = mgv;
    }
    public void setLuongcb(long luongcb){
        this.luongcb = luongcb;
    }
    public String getTen(){
        return this.ten;
    }
    public String getMgv(){
        return this.mgv;
    }
    public long setLuongcb(){
        return this.luongcb;
    }
   
    public long getBacLuong(){
        String s = this.mgv;
        if(s.charAt(s.length()-2) == '0'){
            return s.charAt(s.length()-1) -'0';
        }else{
            String tmp = s.substring(2);
            return Long.parseLong(tmp);
        }
    }
    public long getPhuCap(){
        String s = this.mgv;
        if(s.charAt(0) == 'H' && s.charAt(1) == 'T'){
            return 2000000;
        }else if(s.charAt(0) == 'H' && s.charAt(1) == 'P'){
            return 900000;
        }else{
            return 500000;
        }
    }
    public long getThuNhap(){
        long tmp = getBacLuong();
        long res = 0;
        String s = this.mgv;
        if(s.charAt(0) == 'H' && s.charAt(1) == 'T'){
            res += this.luongcb * tmp + 2000000;
        }else if(s.charAt(0) == 'H' && s.charAt(1) == 'P'){
            res += this.luongcb * tmp + 900000;
        }else{
            res += this.luongcb * tmp + 500000;
        }
        return res;
    }
}
