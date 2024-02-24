/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangLuongTheoPhongBan;

/**
 *
 * @author Duc Thinh
 */
public class PhongBan {
    private String ma_phong, ten_phong;
    
    public PhongBan(String line){
        String[] arr = line.trim().split("\\s++");
        this.ma_phong = arr[0];
        this.ten_phong = "";
        for(int i=1; i<arr.length; i++){
            this.ten_phong += arr[i] + " ";
        }
        this.ten_phong = this.ten_phong.trim();
    }
    
    public String getMaPhong(){
        return this.ma_phong;
    }
    
    public String getTenPhong(){
        return this.ten_phong;
    }
}
