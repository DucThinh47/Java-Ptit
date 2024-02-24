/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
class SinhVien{
    private String ma, ten, lop, dob;
    private double gpa;
    
    public SinhVien(int id, String ten, String lop, String dob, double gpa){
        this.ma = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        if(dob.charAt(1) == '/'){
            dob = "0" + dob;
        }
        //02/2/2002
        if(dob.charAt(4) == '/'){
            dob = dob.substring(0,3) + "0" + dob.substring(3);
        }
        this.dob = dob;
        this.gpa = gpa;
    }
    
    public void in(){
        System.out.print(this.ma + " " + this.ten + " " + this.lop + " " + this.dob + " ");
        System.out.printf("%.2f", this.gpa);
    }
}