/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhToanPhanSo;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class PhanSo {
    private long tu, mau;
    
    public static long gcd(long a, long b){
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    public PhanSo(long tu, long mau){
        long ucln = gcd(tu, mau);
        this.tu = tu / ucln;
        this.mau = mau / ucln;
    }
    
    public PhanSo tong(PhanSo a){
        long tu = this.tu * a.mau + this.mau * a.tu;
        tu *= tu;
        long mau = this.mau * a.mau;
        mau *= mau;
        return new PhanSo(tu,mau);
    }
    
    public PhanSo tich(PhanSo a, PhanSo b){
        long tu = this.tu * a.tu * b.tu;
        long mau = this.mau * a.mau * b.mau;
        return new PhanSo(tu,mau);
    }
    
    @Override
    public String toString(){
        return String.format("%d/%d", this.tu, this.mau);
    }
}
