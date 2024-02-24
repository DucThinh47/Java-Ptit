/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class KhachHang {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private String ma,ten,gioi_tinh,dob,dia_chi;
    private Date tuoiTheoNgay;
    public static int cnt = 0;
    
    
    public long getTuoiTheoNgay(){
        Date currentDate = new Date();
        long ngay = ChronoUnit.DAYS.between(this.tuoiTheoNgay.toInstant(), currentDate.toInstant());
        return ngay;
    }
    
    public KhachHang(String ten, String gioi_tinh, String dob, String dia_chi)throws ParseException{
        this.ma = String.format("KH%03d", ++cnt);
        this.ten = "";
        String[] arr = ten.trim().split("\\s+");
        for(String x : arr){
            this.ten += x.toUpperCase().charAt(0);
            for(int i=1; i<x.length(); i++){
                this.ten += x.toLowerCase().charAt(i);
            }
            this.ten += " ";
        }
        this.ten = this.ten.trim();
        this.gioi_tinh = gioi_tinh;
        //2/1/2002
        //02/1/2002
        if(dob.charAt(1) == '/'){
            dob = "0" + dob;
        }
        if(dob.charAt(4) == '/'){
            dob = dob.substring(0,3) + "0" + dob.substring(3);
        }
        this.dob = dob;
        this.tuoiTheoNgay = sdf.parse(this.dob);
        this.dia_chi = dia_chi;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten +" " + this.gioi_tinh + " " + this.dia_chi + " " + this.dob;
    }
}
