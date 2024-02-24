/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauLacBoBongDa2;

/**
 *
 * @author Duc Thinh
 */
public class TranDau{
    public String ma_tran_dau;
    public int so_cdv;
    public int doanh_thu;
    public String ten_doi;
    
    public TranDau(String line){
        String[] arr = line.trim().split("\\s++");
        this.ma_tran_dau = arr[0];
        this.so_cdv = Integer.parseInt(arr[1]);
    }
    
    public String getMaTranDau(){
        return this.ma_tran_dau.substring(1,3);
    }
    
    public int getSoCdv(){
        return this.so_cdv;
    }
    
    public void setDoanhThu(int n){
        this.doanh_thu += n;
    }
    
    public void setTenDoi(String ten){
        this.ten_doi = ten;
    }
    
    public int getDoanhThu(){
        return this.doanh_thu;
    }
    
    public String getTenDoi(){
        return this.ten_doi;
    }
    
    @Override
    public String toString(){
        return this.ma_tran_dau + " " + this.ten_doi + " " + this.doanh_thu;
    }
}