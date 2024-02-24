/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauLacBoBongDa1;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class TranDau{
    private String ma_tran;
    private int so_cdv;
    private int doanh_thu;
    
    public TranDau(String line){
        String[] arr = line.trim().split("\\s++");
        this.ma_tran = arr[0];
        this.so_cdv = Integer.parseInt(arr[1]);
    }

    public String getMa_tran() {
        return ma_tran;
    }

    public int getSo_cdv() {
        return so_cdv;
    }
    
    public int getDoanh_thu(int n){
        return this.so_cdv * n;
    }
    
    public String getMa_clb(){
        return this.ma_tran.substring(1,3);
    }
    
}