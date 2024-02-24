/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3GK;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Mon> mp = new HashMap<>();
        while(t-->0){
            Mon m = new Mon(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mp.put(m.getMa_mon(), m);
        }
        sc = new Scanner(new File("LICHGD.in"));
        int q = Integer.parseInt(sc.nextLine());
        ArrayList<Nhom> al = new ArrayList<>();
        for(int i=0; i<q; i++){
            Nhom n = new Nhom(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
//            al.add(n);
            if(mp.get(n.getMa_mon()) != null){
                al.get(i).setTenMon(mp.get(al.get(i).getMa_mon()).getTen_mon());
            }
            al.add(n);
        }
        Collections.sort(al, new Comparator<Nhom>() {
            @Override
            public int compare(Nhom o1, Nhom o2) {
                if(o1.getNgay_day() == o2.getNgay_day()){
                    if(o1.getKip() == o2.getKip()){
                        return o1.getTen_gv().compareTo(o2.getTen_gv());
                    }else{
                        return o1.getKip() - o2.getKip();
                    }
                }
                return o1.getNgay_day() - o2.getNgay_day();
            }
        });
        
        String s = sc.nextLine();
        System.out.println("LICH GIANG DAY GIANG VIEN " + s + ":");
        for(Nhom x : al){
            if(x.getTen_gv().equals(s)){
                System.out.println(x);
            }
        }
    }
}
