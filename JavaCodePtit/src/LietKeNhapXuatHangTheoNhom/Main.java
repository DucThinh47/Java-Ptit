/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeNhapXuatHangTheoNhom;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhoHang> al = new ArrayList<>();
        while(t-->0){
            KhoHang a = new KhoHang(sc.nextLine(), Double.parseDouble(sc.nextLine()));
            al.add(a);
        }
        Collections.sort(al, new Comparator<KhoHang>(){
            @Override
            public int compare(KhoHang o1, KhoHang o2){
                if(o1.getThue() - o2.getThue() < 0)
                    return 1;
                else
                    return -1;
            }
        });
        char c = sc.next().charAt(0);
        for(KhoHang x : al){
            if(x.getMaHang().charAt(0) == c){
                System.out.println(x);
            }
        }
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
//B
