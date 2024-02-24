/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangLuongTheoPhongBan;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, PhongBan> mp = new HashMap<>();
        while(t-->0){
            PhongBan p = new PhongBan(sc.nextLine());
            mp.put(p.getMaPhong(), p);
        }
        int q = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> al = new ArrayList<>();
        for(int i=0; i<q; i++){
            NhanVien n = new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            if(mp.containsKey(n.getMaPhong())){
                n.setTenPhong(mp.get(n.getMaPhong()).getTenPhong());
            }
            al.add(n);
        }
        String s = sc.nextLine();
        String tmp = "";
        for(NhanVien x : al){
            if(x.getMaPhong().equals(s)){
                tmp += x.getTenPhong();
                break;
            }
        }
        System.out.println("Bang luong phong " + tmp + ":");
        for(NhanVien x : al){
            if(x.getMaPhong().equals(s)){
                System.out.println(x);
            }
        }
    }
}
//2
//HC Hanh chinh
//KH Ke hoach Dau tu
//3
//C06HC
//Tran Binh Minh
//65
//25
//D03KH
//Le Hoa Binh
//59
//24
//D04KH
//Pham Duc Thinh
//60
//23
//KH
