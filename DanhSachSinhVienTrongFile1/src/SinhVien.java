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
    private String ma;
    private String ten;
    private String lop;
    private String email;
    
    public SinhVien(String ma, String ten, String lop, String email){
        this.ma = ma;
        this.ten = "";
        ten = ten.trim();
        String[] s = ten.split("\\s+");
        for(String x : s){
            this.ten += Character.toUpperCase(x.charAt(0));
            for(int i=1; i<x.length(); i++){
                this.ten += Character.toLowerCase(x.charAt(i));
            }
            this.ten += " ";
        }
        this.lop = lop;
        this.email = email;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + email;
    }
}