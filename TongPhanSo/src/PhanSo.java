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
class PhanSo {
    private long tu;
    private long mau;
    
//    public PhanSo(long tu, long mau){
//        this.tu = tu;
//        this.mau = mau;
//    }
    
    
    public PhanSo(Scanner sc){
        this.tu = sc.nextLong();
        this.mau = sc.nextLong();
    }
    
    public void setTu(long tu){
        this.tu = tu;
    }
    public void setMau(long mau){
        this.mau = mau;
    }
    public long getTu(){
        return this.tu;
    }
    public long getMau(){
        return this.mau;
    }
    
    public long GCD(long a, long b){
        if(b == 0)
            return a;
        return GCD(b, a % b);
    }
    
    public void rutGon(){
        if(this.getMau() == 1){
            System.out.println(this.getTu());
        }else{
            long t = this.getTu() / GCD(this.getTu(), this.getMau());
            long m = this.getMau() / GCD(this.getTu(), this.getMau());
            System.out.println(t + "/" + m);
        }
    }
    
    public void cong(PhanSo c){
        long t = this.getMau() * c.getTu() + this.getTu() * c.getMau();
        long m = this.getMau() * c.getMau();
        this.setTu(t);
        this.setMau(m);
        rutGon();
    }
}
