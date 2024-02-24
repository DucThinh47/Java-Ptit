/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhNgayHetHanBaoHanh;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, SanPham> mp = new HashMap<>();
        while(t-->0){
            SanPham p = new SanPham(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            mp.put(p.getId(), p);
        }
        t = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> al = new ArrayList<>();
        while(t-->0){
            KhachHang k = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine());
            k.setDate(mp.get(k.getIDSP()).getMonths());
            k.setPrice(mp.get(k.getIDSP()).getPrice());
            al.add(k);
        }
        Collections.sort(al);
        for(KhachHang x : al){
            System.out.println(x);
        }
    }
}
