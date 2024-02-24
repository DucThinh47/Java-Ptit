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
            al.add(new NhanVien(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2){
                if(o1.getThuNhap() == o2.getThuNhap()){
                    return o1.getMa().compareTo(o2.getMa());
                }else{
                    return o2.getThuNhap() - o1.getThuNhap();
                }
            }
        });
        for(NhanVien x : al){
            System.out.println(x);
        }
    }
}
//4
//Tran Thi Yen
//NV
//1000
//24
//Nguyen Van Thanh
//BV
//1000
//30
//Doan Truong An
//TP
//3000
//25
//Le Thanh
//GD
//5000
//28
