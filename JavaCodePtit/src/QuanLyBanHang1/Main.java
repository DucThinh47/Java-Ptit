/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBanHang1;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, KhachHang> mp = new HashMap<>();
        while(t-->0){
            KhachHang k = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp.put(k.getMa(), k);
        }
        int t1 = Integer.parseInt(sc.nextLine());
        Map<String, MatHang> mp1 = new HashMap<>();
        while(t1-->0){
            MatHang m = new MatHang(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            mp1.put(m.getMa(), m);
        }
        int t2 = Integer.parseInt(sc.nextLine());
        ArrayList<HoaDon> al = new ArrayList<>();
        for(int i=0; i<t2; i++){
            String s = sc.nextLine();
            String[] line = s.trim().split("\\s++");
            KhachHang k1 = mp.get(line[0]);
            MatHang m1 = mp1.get(line[1]);
            HoaDon h = new HoaDon(k1,m1,Integer.parseInt(line[2]));
            al.add(h);
        }
        for(HoaDon x : al){
            System.out.println(x);
        }
    }
}
//2
//Nguyen Van Nam
//Nam
//12/12/1997
//Mo Lao-Ha Dong-Ha Noi
//Tran Van Binh
//Nam
//11/14/1995
//Phung Khoang-Nam Tu Liem-Ha Noi
//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
//3
//KH001 MH001 2
//KH001 MH002 3
//KH002 MH002 4