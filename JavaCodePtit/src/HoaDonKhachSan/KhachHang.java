/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDonKhachSan;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.temporal.ChronoUnit;
public class KhachHang {
    private String ma, ten, so_phong;
    private Date ngay_nhan, ngay_tra;
    private int tien_phat_sinh;
    private int don_gia;
//    private int thanh_tien;
    public static int cnt = 0;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public KhachHang(String ten, String so_phong, String ngay_nhan, String ngay_tra, int tien_phat_sinh) throws ParseException{
        this.ma = String.format("KH%02d", ++cnt);
        this.ten = ten.trim();
        this.so_phong = so_phong;
        this.ngay_nhan = sdf.parse(ngay_nhan);
        this.ngay_tra = sdf.parse(ngay_tra);
        this.tien_phat_sinh = tien_phat_sinh;
        if(so_phong.charAt(0) == '1'){
            this.don_gia = 25;
        }else if(so_phong.charAt(0) == '2'){
            this.don_gia = 34;
        }else if(so_phong.charAt(0) == '3'){
            this.don_gia = 50;
        }else{
            this.don_gia = 80;
        }
    }
    
    public int getNgayO(){
        return (int)ChronoUnit.DAYS.between(ngay_nhan.toInstant(), ngay_tra.toInstant()) + 1;
    }
    
    public int getThanhTien(){
        return this.don_gia * this.getNgayO() + this.tien_phat_sinh;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.so_phong + " " + this.getNgayO() + " " + this.getThanhTien();
    }
}
