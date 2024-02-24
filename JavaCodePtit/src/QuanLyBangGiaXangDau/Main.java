/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyBangGiaXangDau;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<XangDau> al = new ArrayList<>();
        while(t-->0){
            al.add(new XangDau(sc.nextLine()));
        }
        Collections.sort(al, new Comparator<XangDau>(){
            @Override
            public int compare(XangDau o1, XangDau o2){
                if(o1.getThanhTien() - o2.getThanhTien() < 0)
                    return 1;
                return -1;
            }
        });
        for(XangDau x : al){
            System.out.println(x);
        }
    }
}
//3
//N89BP 4500
//D00TN 3500
//X92SH 2600