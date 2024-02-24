/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
class SinhVien {
    private String msv = "B20DCCN001";
    private String ten;
    private String lop;
    private String dob;
    private double gpa;
    
    public SinhVien(){
        this.ten = "";
        this.lop = "";
        this.dob = "";
        this.gpa = 0;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public void setLop(String lop){
        this.lop = lop;
    }
    public void setDob(String dob){
        this.dob =dob;
    }
    public void setGpa(Double gpa){
        this.gpa = gpa;
    }
    public String getTen(){
        return this.ten;
    }
    public String getLop(){
        return this.lop;
    }
    public String getDob(){
        return this.dob;
    }
    public Double getGpa(){
        return this.gpa;
    }
    public String getMsv(){
        return this.msv;
    }
    //2/2/2002 ok
    //2/02/2002 ok
    //04/2/2002 !ok
    //12/12/2002 ok
    public String solve(String s){
        String res = "";
        if(s.charAt(1) == '/' && s.charAt(3) == '/'){
            res = "0" + s.substring(0,2) + "0" + s.substring(2);
            return res;
        }else if(s.charAt(1) == '/' && s.charAt(4) == '/'){
            res = "0" + s;
            return res;
        }else if(s.charAt(2) == '/' && s.charAt(4) == '/'){
            res = s.substring(0,3) + "0" + s.substring(3);
            return res;
        }else{
            return s;
        }
    }
    public void set(Scanner sc){
        this.ten = sc.nextLine();
        this.lop = sc.next();
        String s = sc.next();
        this.gpa = sc.nextDouble();
        this.dob = solve(s);
    }
}
