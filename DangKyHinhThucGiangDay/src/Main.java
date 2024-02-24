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
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> al = new ArrayList<>();
        while(t-->0){
            al.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<MonHoc>(){
           @Override
           public int compare(MonHoc o1, MonHoc o2){
               return o1.getMa().compareTo(o2.getMa());
           }
        });
        for(MonHoc x : al){
            if(x.getTh().compareTo("Truc tuyen") == 0 || x.getTh().contains(".ptit.edu.vn")){
                System.out.println(x);
            }
        }
        sc.close();
    }
}