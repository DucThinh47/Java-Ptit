/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoPhuc;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SoPhuc {
    private int thuc, ao;
    
    public SoPhuc(int thuc, int ao){
        this.thuc = thuc;
        this.ao = ao;
    }
    
    public SoPhuc tong(SoPhuc a){
        int thuc = this.thuc + a.thuc;
        int ao = this.ao + a.ao;
        return new SoPhuc(thuc, ao);
    }
    
    public SoPhuc tich(SoPhuc a){
        int thuc = this.thuc * a.thuc - this.ao * a.ao;
        int ao = this.ao * a.thuc + this.thuc * a.ao;
        return new SoPhuc(thuc, ao);
    }
    
    @Override
    public String toString(){
        String res = "";
        res += String.valueOf(this.thuc);
        if(this.ao < 0)
            res += " - ";
        else
            res += " + ";
        res += String.valueOf(Math.abs(this.ao)) + 'i';
        return res;
    }
}
