/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhNgayHetHanBaoHanh;

/**
 *
 * @author Duc Thinh
 */
import java.time.*;
import java.time.format.*;
public class KhachHang implements Comparable<KhachHang>{
    public static int stt = 0;
    private String IDKH, name, address, IDSP; 
    private int quantity, priceSp, dateSP;
    LocalDate buyDate;
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public KhachHang(String name, String address, String IDSP_KH, int quantity, String buyDate){
        this.IDKH = String.format("KH%02d", ++stt);
        this.name = name;
        this.address = address;
        this.IDSP = IDSP_KH;
        this.quantity = quantity;
        this.buyDate = LocalDate.parse(buyDate, dtf);
    }
    
    public void setPrice(int n){
        this.priceSp = quantity * n;
    }
    
    public String getIDSP(){
        return this.IDSP;
    }
    
    public void setDate(int n){
        this.buyDate = this.buyDate.plusMonths(n);
    }
    
    @Override
    public int compareTo(KhachHang o){
        if(this.buyDate.equals(o.buyDate))
            return this.IDKH.compareTo(o.IDKH);
        else
            return this.buyDate.compareTo(o.buyDate);
    }
    
    @Override
    public String toString(){
        String tmp = buyDate.format(dtf);
        return IDKH + " " + name + " " + address + " " + IDSP + " " + priceSp + " " + tmp;
    }
}
