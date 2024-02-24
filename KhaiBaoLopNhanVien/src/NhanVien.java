/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
class NhanVien {
    private String mnv = "00001"; 
    private String ten;
    private String gt;
    private String dob;
    private String adr;
    private String mst;
    private String hd;
    
    public NhanVien(Scanner sc){
        this.ten = sc.nextLine();
        this.gt = sc.nextLine();
        this.dob = sc.nextLine();
        this.adr = sc.nextLine();
        this.mst = sc.nextLine();
        this.hd = sc.nextLine();
    }
    
    public String getMnv(){
        return this.mnv;
    }
    public String getTen(){
        return this.ten;
    }
    public String getGt(){
        return this.gt;
    }
    public String getDob(){
        return this.dob;
    }
    public String getAdr(){
        return this.adr;
    }
    public String getMst(){
        return this.mst;
    }
    public String getHd(){
        return this.hd;
    }
}
