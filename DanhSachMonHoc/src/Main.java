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
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> al = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            al.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextInt()));
            sc.nextLine();
        }
        Collections.sort(al, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for(MonHoc x : al){
            System.out.println(x);
        }
    }
}
