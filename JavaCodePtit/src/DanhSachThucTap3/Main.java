/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachThucTap3;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        Map<String, SinhVien> mp = new HashMap<>();
        while (t-- > 0) {
            SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp.put(s.getMaSv(), s);
        }
        sc = new Scanner(new File("DN.in"));
        int q = Integer.parseInt(sc.nextLine());
        Map<String, DoanhNghiep> mp1 = new HashMap<>();
        while (q-- > 0) {
            DoanhNghiep d = new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mp1.put(d.getMa_doanh_nghiep(), d);
        }
        sc = new Scanner(new File("THUCTAP.in"));
        int q1 = Integer.parseInt(sc.nextLine());
        ArrayList<ThucTap> al = new ArrayList<>();
        for (int i = 0; i < q1; i++) {
            ThucTap tt = new ThucTap(sc.nextLine());
            al.add(tt);
            if (mp.containsKey(al.get(i).getMa_sv()) && mp1.containsKey(al.get(i).getMaDoanhNghiep())) {
                
                al.get(i).setMaSv(mp.get(al.get(i).getMa_sv()).getMaSv());
                al.get(i).setTenSv(mp.get(al.get(i).getMa_sv()).getTen_sv());
                al.get(i).setLop(mp.get(al.get(i).getMa_sv()).getLop());
                al.get(i).setMaDoanhNghiep(mp1.get(al.get(i).getMaDoanhNghiep()).getMa_doanh_nghiep());
                al.get(i).setTenDoanhNghiep(mp1.get(al.get(i).getMaDoanhNghiep()).getTen_doanh_nghiep());
            }
        }
        Collections.sort(al, new Comparator<ThucTap>() {
            @Override
            public int compare(ThucTap o1, ThucTap o2) {
                return o1.getMa_sv().compareTo(o2.getMa_sv());
            }
        });
        int q2 = Integer.parseInt(sc.nextLine());
        while(q2-->0) {
            String s = sc.nextLine();
            String tmp = "";
            for (int j = 0; j < al.size(); j++) {
                if (al.get(j).getMaDoanhNghiep().equals(s)) {
                    tmp = al.get(j).getTenDoanhNghiep();
                }
            }
            System.out.println("DANH SACH THUC TAP TAI " + tmp + ":");
            for(ThucTap x : al){
                if(x.getTenDoanhNghiep().equals(tmp)){
                    System.out.println(x);  
                }
            }
        }
    }
}
