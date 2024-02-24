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
import java.lang.*;
class MatHang {
    public static int cnt = 0;
    private String ma;
    private String ten;
    private String dv;
    private int mua;
    private int ban;

    public MatHang(String ten, String dv, int mua, int ban) {
        this.ma = String.format("MH%03d", ++cnt);
        this.ten = ten;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDv() {
        return dv;
    }

    public int getMua() {
        return mua;
    }

    public int getBan() {
        return ban;
    }
    public int getLoiNhuan(){
        return this.ban - this.mua;
    }
    @Override
    public String toString(){
        return ma + " " + ten + " " + dv + " " + mua + " " + ban + " " + getLoiNhuan();
    }
}
