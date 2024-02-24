/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<LuyenTap> al = new ArrayList<>();
        while(t-->0){
            al.add(new LuyenTap(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<LuyenTap>(){
           @Override
           public int compare(LuyenTap o1, LuyenTap o2){
               if(o1.getBai() == o2.getBai()){
                   if(o1.getSub() == o2.getSub()){
                       return o1.getTen().compareTo(o2.getTen());
                   }else{
                       return o1.getSub() - o2.getSub();
                   }
               }
               return o2.getBai() - o1.getBai();
           }
        });
        for(LuyenTap x : al){
            System.out.println(x);
        }
    }
}
