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
        ArrayList<SinhVien> al = new ArrayList<>();
        while(t-->0){
            al.add(new SinhVien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<SinhVien>(){
           @Override
           public int compare(SinhVien o1, SinhVien o2){
               if(o1.getSoBai() == o2.getSoBai()){
                   if(o1.getSoNop() == o2.getSoNop()){
                       return o1.getTen().compareTo(o2.getTen());
                   }else{
                       return o1.getSoNop() - o2.getSoNop();
                   }
               }else{
                   return o2.getSoBai() - o1.getSoBai();
               }
           }
        });
        for(SinhVien x : al){
            System.out.println(x);
        }
    }
}
//2
//Nguyen Van Nam
//168 600
//Tran Thi Ngoc
//168 600