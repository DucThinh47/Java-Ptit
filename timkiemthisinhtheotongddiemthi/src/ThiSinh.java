/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.DecimalFormat;

public class ThiSinh {

    private String ma, ten, dan_toc;
    private double toan, ly, hoa;
    private double uu_tien;
    private double giai_qg;
    private double tong_diem;
    private String trang_thai;

    public ThiSinh(String ma, String ten, String dan_toc, double toan, double ly, double hoa, double giai_qg) {
        this.ma = ma;
        this.ten = ten;
        this.dan_toc = dan_toc.toLowerCase();
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.giai_qg = giai_qg;
        if (this.ma.substring(0, 3).equals("KV1")) {
            this.uu_tien = 0;
        } else if (this.ma.substring(0, 3).equals("KV2")) {
            this.uu_tien = 1;
        } else if (this.ma.substring(0, 3).equals("KV3")) {
            this.uu_tien = 2;
        }
        if (this.dan_toc.compareTo("kinh") != 0) {
            this.uu_tien += 1;
        }
        if (this.giai_qg == 0) {
            this.uu_tien += 0;
        } else if (this.giai_qg == 1) {
            this.uu_tien += 1.5;
        } else if(this.giai_qg == 2){
            this.uu_tien += 1;
        }else{
            this.uu_tien += 0.5;
        }
        this.tong_diem = toan + ly + hoa;
        if (this.tong_diem + this.uu_tien >= 26.8) {
            this.trang_thai = "TRUNG TUYEN";
        } else {
            this.trang_thai = "TRUOT";
        }
    }
    
    public double getDiemTong(){
        return this.tong_diem;
    }
    
    public double getUuTien(){
        return this.uu_tien;
    }
    
    @Override
    public String toString() {
        return this.ma + " " + this.ten + " " + (new DecimalFormat().format(this.uu_tien)) + " " + (new DecimalFormat().format(this.tong_diem)) + " " + this.trang_thai;

    }
}
