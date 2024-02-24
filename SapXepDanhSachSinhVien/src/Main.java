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
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> al = new ArrayList<>();
        while(t-->0){
            al.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<SinhVien>(){
           @Override
           public int compare(SinhVien o1, SinhVien o2){
               if(o1.getLastName().compareTo(o2.getLastName()) == 0){
                   if(o1.getFirstName().compareTo(o2.getFirstName()) == 0){
                       return o1.getMsv().compareTo(o2.getMsv());
                   }else{
                       return o1.getFirstName().compareTo(o2.getFirstName());
                   }
               }else{
                   return o1.getLastName().compareTo(o2.getLastName());
               }
           }
        });
        for(SinhVien x : al){
            System.out.println(x);
        }
    }
}
