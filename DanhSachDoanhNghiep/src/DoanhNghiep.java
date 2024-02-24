/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
class DoanhNghiep {
    private String ma,ten;
    private int ssv;
    
    public DoanhNghiep(String ma, String ten, int ssv){
        this.ma = ma;
        this.ten = ten;
        this.ssv = ssv;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSsv() {
        return ssv;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + ssv;
    }
}
