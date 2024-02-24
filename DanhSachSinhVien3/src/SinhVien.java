/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SinhVien {
    private String ma,ten,lop,dob;
    private double gpa;
    public static int cnt = 0;
    
    public SinhVien(String ten, String lop, String dob, double gpa){
        this.ma = String.format("B20DCCN%03d", ++cnt);
        this.ten = "";
        String[] arr = ten.trim().split("\\s+");
        for(String x : arr){
            this.ten += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++){
                this.ten += Character.toLowerCase(x.charAt(i));
            }
            this.ten += " ";
        }
        this.ten = this.ten.trim();
        this.lop = lop;
        this.dob = dob;
        if(this.dob.charAt(1) == '/'){
            this.dob = "0" + this.dob;
        }
        if(this.dob.charAt(4) == '/'){
            this.dob = this.dob.substring(0,3) + "0" + this.dob.substring(3);
        }
        this.gpa = gpa;
    }
    
    public double getGpa(){
        return this.gpa;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f", this.ma, this.ten, this.lop, this.dob, this.gpa);
    }
}
