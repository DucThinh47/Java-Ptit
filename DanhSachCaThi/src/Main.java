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
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<CaThi> al = new ArrayList<>();
        while(t-->0){
            al.add(new CaThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<CaThi>(){
           @Override
           public int compare(CaThi o1, CaThi o2){
               if(o1.getNgay().compareTo(o2.getNgay()) == 0){
                   if(o1.getGiay() == o2.getGiay()){
                       return o1.getMa().compareTo(o2.getMa());
                   }else{
                       return o1.getGiay() - o2.getGiay();
                   }
               }else{
                   return o1.getNgay().compareTo(o2.getNgay());
               }
           }
        });
        for(CaThi x : al){
            System.out.println(x);
        }
    }
}