/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
class LoaiPhong implements Comparable<LoaiPhong>{
    private String loaiPhong;
    private Character kh;
    private String ten;
    private Double giaNgay, phucVu;
    
    public LoaiPhong(String loaiPhong){
        this.loaiPhong = loaiPhong;
        String[] s = loaiPhong.split("\\s+");
        this.kh = s[0].charAt(0);
        this.ten = s[1];
        this.giaNgay = Double.parseDouble(s[2]);
        this.phucVu = Double.parseDouble(s[3]);
    } 
    
    @Override
    public int compareTo(LoaiPhong o){
        return this.ten.compareTo(o.ten);
    }
    @Override
    public String toString(){
        return this.loaiPhong;
    }
}
