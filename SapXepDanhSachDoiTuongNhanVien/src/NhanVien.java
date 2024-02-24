/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;

public class NhanVien{
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private String ma, ten, gioi_tinh, dia_chi, ma_so_thue, ngay_ky_hd;
    private String dob;
    private Date tuoi_theo_ngay;
    public static int cnt = 0;
    
    public NhanVien(String ten, String gioi_tinh, String dob, String dia_chi, String ma_so_thue, String ngay_ky_hd)throws ParseException{
        this.ma = String.format("%05d",++cnt);
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.dob = dob;
        this.dia_chi = dia_chi;
        this.ma_so_thue = ma_so_thue;
        this.ngay_ky_hd = ngay_ky_hd;
        this.tuoi_theo_ngay = sdf.parse(dob);
    }
    
    
    public long getTuoiTheoNgay(){
        Date currentDate = new Date();
        long ngay = ChronoUnit.DAYS.between(this.tuoi_theo_ngay.toInstant(), currentDate.toInstant());
        return ngay;
    }
    
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.gioi_tinh + " " + this.dob + " " + this.dia_chi + " " + this.ma_so_thue + " " + this.ngay_ky_hd;
    }
}