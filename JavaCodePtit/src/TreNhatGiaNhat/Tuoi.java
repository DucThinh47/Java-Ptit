/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreNhatGiaNhat;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Tuoi {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private String ten, dob;
    private Date tuoiTheoNgay;
    
    public Tuoi(String line)throws ParseException{
        String[] arr = line.trim().split("\\s++");
        this.ten = arr[0];
        this.dob = arr[1];
        this.tuoiTheoNgay = sdf.parse(dob);
    }
    
    public long getTuoiTheoNgay(){
        Date currentDate = new Date();
        long ngay = ChronoUnit.DAYS.between(this.tuoiTheoNgay.toInstant(), currentDate.toInstant());
        return ngay;
    }
    
    @Override
    public String toString(){
        return this.ten;
    }
}
