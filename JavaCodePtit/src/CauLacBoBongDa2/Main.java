/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauLacBoBongDa2;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, CLB> mp = new HashMap<>();
        for(int i=0; i<t; i++){
            CLB c = new CLB(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mp.put(c.getMaClb(), c);
        }
        t = Integer.parseInt(sc.nextLine());
        ArrayList<TranDau> al = new ArrayList<>();
        for(int i=0; i<t; i++){
            TranDau a = new TranDau(sc.nextLine());
            al.add(a);
            if(mp.containsKey(a.getMaTranDau())){
                al.get(i).setDoanhThu(al.get(i).getSoCdv() * mp.get(al.get(i).getMaTranDau()).getGiaVe());
                al.get(i).setTenDoi(mp.get(al.get(i).getMaTranDau()).getTenClb());
            }
        }
        Collections.sort(al, new Comparator<TranDau>(){
            @Override
            public int compare(TranDau o1, TranDau o2){
                if(o1.getDoanhThu() == o2.getDoanhThu())
                    return o1.getTenDoi().compareTo(o2.getTenDoi());
                else
                    return o2.getDoanhThu() - o1.getDoanhThu();
            }
        });
        for(TranDau x : al){
            System.out.println(x);
        }
    }
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000
