/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LichGiangDayTheoMonHoc;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        Map<String, MonHoc> mp = new HashMap<>();
        while(t-->0){
            MonHoc m = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mp.put(m.getMaMon(), m);
        }
        sc = new Scanner(new File("LICHGD.in"));
        int q = Integer.parseInt(sc.nextLine());
        ArrayList<LichGD> al = new ArrayList<>();
        for(int i=0; i<q; i++){
            LichGD l = new LichGD(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            if(mp.containsKey(l.getMaMon())){
                l.setTenMon(mp.get(l.getMaMon()).getTenMon());
            }
            al.add(l);
        }
        String s = sc.nextLine();
        String tmp = "";
        for(LichGD x : al){
            if(x.getMaMon().equals(s)){
                tmp = x.getTenMon();
            }
        }
        System.out.println("LICH GIANG DAY MON " + tmp + ":");
        Collections.sort(al, new Comparator<LichGD>(){
            @Override
            public int compare(LichGD o1, LichGD o2){
                if(o1.getThu() == o2.getThu()){
                    if(o1.getKip() == o2.getKip()){
                        return o1.getTenGv().compareTo(o2.getTenGv());
                    }else{
                        return o2.getKip() - o1.getKip();
                    }
                }else{
                    return o1.getThu() - o2.getThu();
                }
            }
        });
        for(LichGD x : al){
            if(x.getTenMon().equals(tmp)){
                System.out.println(x);
            }
        }
    }
}
