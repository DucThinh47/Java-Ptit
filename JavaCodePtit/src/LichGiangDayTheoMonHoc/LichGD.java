/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LichGiangDayTheoMonHoc;

/**
 *
 * @author Duc Thinh
 */
public class LichGD {
    private String ma_mon, ten_mon;
    private int thu,kip;
    private String ten_gv, phong_hoc;
    private String ma_nhom;
    public static int cnt = 0;
    
    public LichGD(String ma_mon, int thu, int kip, String ten_gv, String phong_hoc){
        this.ma_mon = ma_mon;
        this.thu = thu;
        this.kip = kip;
        this.ten_gv = ten_gv;
        this.phong_hoc = phong_hoc;
        this.ma_nhom = String.format("HP%03d", ++cnt);
    }
    
    public int getThu(){
        return this.thu;
    }
    
    public int getKip(){
        return this.kip;
    }
    
    public String getTenGv(){
        return this.ten_gv;
    }
    
    public String getMaMon(){
        return this.ma_mon;
    }
    
    public void setTenMon(String s){
        this.ten_mon = s;
    }
    
    public String getTenMon(){
        return this.ten_mon;
    }
    
    @Override
    public String toString(){
        return this.ma_nhom + " " + this.thu + " " + this.kip + " " + this.ten_gv + " " + this.phong_hoc;
    }
}
