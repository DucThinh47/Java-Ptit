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
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> al = new ArrayList<>();
        while(t-->0){
            al.add(new KhachHang(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<KhachHang>(){
           @Override
           public int compare(KhachHang o1, KhachHang o2){
               return o2.getTongTien() - o1.getTongTien();
           }
        });
        for(KhachHang x : al){
            System.out.println(x);
        }
    }
}
