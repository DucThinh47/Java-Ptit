/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachThucTap3;

/**
 *
 * @author Duc Thinh
 */
public class DoanhNghiep {
    public String ma_doanh_nghiep, ten_doanh_nghiep;
    public int so_sv;
    
    public DoanhNghiep(String ma_doanh_nghiep, String ten_doanh_nghiep, int so_sv){
        this.ma_doanh_nghiep = ma_doanh_nghiep;
        this.ten_doanh_nghiep = ten_doanh_nghiep;
        this.so_sv = so_sv;
    }

    public String getMa_doanh_nghiep() {
        return ma_doanh_nghiep;
    }

    public String getTen_doanh_nghiep() {
        return ten_doanh_nghiep;
    }

    public int getSo_sv() {
        return so_sv;
    }
    
    
}
