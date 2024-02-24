/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhLuong;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, PhongBan> mp = new HashMap<>();
        while(t-->0){
            PhongBan p = new PhongBan(sc.nextLine());
            mp.put(p.getMaPhong(), p);
        }
        int q = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> al = new ArrayList<>();
        for(int i=0; i<q; i++){
            NhanVien n = new NhanVien(sc.nextLine(),sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            al.add(n);
            if(mp.containsKey(al.get(i).getMaPhong())){
                al.get(i).setPhongBan(mp.get(al.get(i).getMaPhong()).getTenPhong());
            }
        }
        for(NhanVien x : al){
            System.out.println(x);
        }
    }
}
//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//2
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24
