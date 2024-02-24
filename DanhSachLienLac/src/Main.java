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
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> al = new ArrayList<>();
        while(sc.hasNextLine()){
            al.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<SinhVien>(){
           @Override
           public int compare(SinhVien o1, SinhVien o2){
               if(o1.getLop().equals(o2.getLop())){
                   return o1.getMa().compareTo(o2.getMa());
               }else{
                   return o1.getLop().compareTo(o2.getLop());
               }
           }
        });
        for(SinhVien x : al){
            System.out.println(x);
        }
    }
}
