/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> al = new ArrayList<>();
        while(t-->0){
            al.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        int chi_tieu = Integer.parseInt(sc.nextLine());
        Collections.sort(al, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2){
                if(o1.getDiemTong() == o2.getDiemTong()){
                    return o1.getMa().compareTo(o2.getMa());
                }else{
                    if(o1.getDiemTong() - o2.getDiemTong() < 0){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        });
        if(chi_tieu > al.size()){
            chi_tieu = al.size();
        }
        double diem_chuan = al.get(chi_tieu-1).getDiemTong();
        System.out.printf("%.1f\n", diem_chuan);
        for(ThiSinh x : al){
            if(x.getDiemTong() >= diem_chuan){
                x.setTrangThai("TRUNG TUYEN");
            }else{
                x.setTrangThai("TRUOT");
            }
            System.out.println(x);
        }
    }
}
