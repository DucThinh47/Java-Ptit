/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepBangTinhTienDien;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class KhachHang {
    private String ma,loai;
    private double cs_cu, cs_moi,he_so,thanh_tien,phu_troi,tong;
    public static int cnt = 0;
    
    public KhachHang(String loai, double cs_cu, double cs_moi){
        this.ma = String.format("KH%02d", ++cnt);
        this.loai = loai;
        this.cs_cu = cs_cu;
        this.cs_moi = cs_moi;
        if(loai.equals("KD")){
            this.he_so = 3;
        }else if(loai.equals("NN")){
            this.he_so = 5;
        }else if(loai.equals("TT")){
            this.he_so = 4;
        }else{
            this.he_so = 2;
        }
        this.thanh_tien = (cs_moi - cs_cu) * this.he_so * 550;
        if((cs_moi - cs_cu) < 50){
            this.phu_troi = 0;
        }else if(50 <= (cs_moi - cs_cu) && (cs_moi - cs_cu) <= 100){
            this.phu_troi = Math.round(this.thanh_tien * 35 / 100);
        }else{
            this.phu_troi = Math.round(this.thanh_tien);
        }
        this.tong = this.phu_troi + this.thanh_tien;
    }
    
    public double getTong(){
        return this.tong;
    }
    
    @Override
    public String toString(){
        return String.format("%s %.0f %.0f %.0f %.0f", this.ma, this.he_so, this.thanh_tien, this.phu_troi, this.tong);
    }
}
