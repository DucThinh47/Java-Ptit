/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDiemTrungBinh;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<SinhVien> al = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++) {
            al.add(new SinhVien(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if(o1.getDiemTb() == o2.getDiemTb())
                    return o1.getMa().compareTo(o2.getMa());
                else{
                    if(o1.getDiemTb() - o2.getDiemTb() < 0)
                        return 1;
                    else
                        return -1;
                }
            }
        });
        al.get(0).setHang(1);
        System.out.println(al.get(0));

        for (int i = 1; i < t; i++) {
            if (al.get(i).getDiemTb() == al.get(i - 1).getDiemTb()) {
                al.get(i).setHang(al.get(i - 1).getHang());
            } else {
                al.get(i).setHang(i + 1);
            }
            System.out.println(al.get(i));
        }
    }
}
