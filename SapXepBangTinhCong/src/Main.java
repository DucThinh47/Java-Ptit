/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> al = new ArrayList<>();
        while(t-->0){
            al.add(new NhanVien(sc.nextLine(), Long.parseLong(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2){
                return (int)(o2.getThuNhap() - o1.getThuNhap());
            }
        });
        for(NhanVien x : al){
            System.out.println(x);
        }
    }
}

//3
//Cao Van Vu
//50000
//26
//GD
//Do Van Truong
//40000
//25
//PGD
//Truong Thi Tu Linh
//45000
//22
//NV


