/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachKhachHang;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
public class KhachHang {
    public static int cnt = 0;
    private String ma,ten,gioi_tinh,dob,dia_chi;
    private Date days_of_birth;
    Date current_date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    
    public String solveDob(String s){
        StringBuilder tmp = new StringBuilder(s);
        if(tmp.charAt(1)=='/')
            tmp.insert(0, '0');
        if(tmp.charAt(4) == '/')
            tmp.insert(3, '0');
        return tmp.toString();
    }
    
    public KhachHang(String ten, String gioi_tinh, String dob, String dia_chi) throws ParseException{
        this.ma = String.format("KH%03d", ++cnt);
        this.ten = "";
        String[] arr = ten.trim().split("\\s++");
        for(String x : arr){
            this.ten += x.toUpperCase().charAt(0);
            for(int i=1; i<x.length(); i++){
                this.ten += x.toLowerCase().charAt(i);
            }
            this.ten += " ";
        }
        this.ten = this.ten.trim();
        this.gioi_tinh = gioi_tinh;
        this.dob = this.solveDob(dob);
        this.days_of_birth = sdf.parse(this.solveDob(dob));
        this.dia_chi = dia_chi;
    }
    
    public int getDaysOfBirth(){
        return (int)ChronoUnit.DAYS.between(this.days_of_birth.toInstant(), current_date.toInstant());
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.gioi_tinh + " "+ this.dia_chi + " " + this.dob;
    }
}
