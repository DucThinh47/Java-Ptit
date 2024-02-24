/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class MonThi {
    private String ma, ten, hinhThuc;
    
    public MonThi(String ma, String ten, String hinhThuc){
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.hinhThuc;
    }
}
