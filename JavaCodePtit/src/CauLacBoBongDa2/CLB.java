/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauLacBoBongDa2;

/**
 *
 * @author Duc Thinh
 */
public class CLB{
    public String ma_clb, ten_clb;
    public int gia_ve;
    
    public CLB(String ma_clb, String ten_clb, int gia_ve){
        this.ma_clb = ma_clb;
        this.ten_clb = ten_clb;
        this.gia_ve = gia_ve;
    }
    
    public String getMaClb(){
        return this.ma_clb;
    }
    
    public String getTenClb(){
        return this.ten_clb;
    }
    
    public int getGiaVe(){
        return this.gia_ve;
    }
}