/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang1;

/**
 *
 * @author Duc Thinh
 */
public class KhachHang {
    public static int cnt = 0;
    private String ma;
    private String ten;
    private String gioi_tinh;
    private String dob;
    private String dia_chi;
    
    public KhachHang(String ten, String gioi_tinh, String dob, String dia_chi){
        this.ma = String.format("KH%03d", ++cnt);
        this.ten = ten;
        this.gioi_tinh = gioi_tinh;
        this.dob = dob;
        this.dia_chi = dia_chi;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public String getName(){
        return this.ten;
    }
    
    public String getAddress(){
        return this.dia_chi;
    }
}
