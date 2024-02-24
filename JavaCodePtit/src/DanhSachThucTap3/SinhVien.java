/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachThucTap3;

/**
 *
 * @author Duc Thinh
 */
public class SinhVien {
    public String ma_sv,ten_sv,lop,email;
    
    public SinhVien(String ma_sv, String ten_sv, String lop, String email){
        this.ma_sv = ma_sv;
        this.ten_sv = "";
        String[] arr = ten_sv.trim().split("\\s++");
        for(String x : arr){
            this.ten_sv += x.toUpperCase().charAt(0);
            for(int i=1; i<x.length(); i++){
                this.ten_sv += x.toLowerCase().charAt(i);
            }
            this.ten_sv += " ";
        }
        this.ten_sv = this.ten_sv.trim();
        this.lop =lop;
        this.email = email;
    }

    public String getMaSv() {
        return ma_sv;
    }

    public String getTen_sv() {
        return ten_sv;
    }

    public String getLop() {
        return lop;
    }

    public String getEmail() {
        return email;
    }
    
}
