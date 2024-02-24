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

class PhanSo{
    private long tu;
    private long mau;
    
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
    
}
