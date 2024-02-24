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
        ArrayList<GiangVien> al = new ArrayList<>();
        while(t-->0){
            al.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<GiangVien>(){
           @Override
           public int compare(GiangVien o1, GiangVien o2){
               if(o1.getLastName().compareTo(o2.getLastName()) == 0){
                   return o1.getMa().compareTo(o2.getMa());
               }else{
                   return o1.getLastName().compareTo(o2.getLastName());
               }
           }
        });
        for(GiangVien x : al){
            System.out.println(x);
        }
    }
}
