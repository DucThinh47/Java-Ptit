/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang1;

/**
 *
 * @author Duc Thinh
 */
public class HoaDon {
    public static int cnt = 0;
    private String ma;
    private KhachHang khach_hang;
    private MatHang mat_hang;
    private int so_luong;
    
    
    
    public HoaDon(KhachHang khach_hang, MatHang mat_hang, int so_luong){
        this.ma = String.format("HD%03d", ++cnt);
        this.khach_hang = khach_hang;
        this.mat_hang = mat_hang;
        this.so_luong = so_luong;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + khach_hang.getName() + " " + khach_hang.getAddress() + " " + mat_hang.getName() + " " + mat_hang.getDonVi() + " " + mat_hang.getGiaMua() + " " + mat_hang.getGiaBan() + " " + this.so_luong + " " + (mat_hang.getGiaBan() * this.so_luong);
    }
}
