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
        ArrayList<DoanhNghiep> al = new ArrayList<>();
        while(t-->0){
            al.add(new DoanhNghiep(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<DoanhNghiep>(){
           @Override
           public int compare(DoanhNghiep o1, DoanhNghiep o2){
               if(o1.getSoSinhVien() == o2.getSoSinhVien()){
                   return o1.getMa().compareTo(o2.getMa());
               }else{
                   return o2.getSoSinhVien() - o1.getSoSinhVien();
               }
           }
        });
        for(DoanhNghiep x : al){
            System.out.println(x);
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
