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
class ThiSinh {
    private String ten;
    private String ns;
    private float m1;
    private float m2;
    private float m3;
    
    public ThiSinh(Scanner sc){
        this.ten = sc.nextLine();
        this.ns = sc.next();
        this.m1 = sc.nextFloat();
        this.m2 = sc.nextFloat();
        this.m3 = sc.nextFloat();
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setNs(String ns){
        this.ns = ns;
    }
    public void setM1(float m1){
        this.m1 = m1;
    }
    public void setM2(float m2){
        this.m2 = m2;
    }
    public void setM3(float m3){
        this.m3 = m3;
    }
    public String getTen(){
        return this.ten;
    }
    public String getNs(){
        return this.ns;
    }
    public float getM1(){
        return this.m1;
    }
    public float getM2(){
        return this.m2;
    }
    public float getM3(){
        return this.m3;
    }
}
