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
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<DonHang> al = new ArrayList<>();
        while(t-->0){
            al.add(new DonHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<DonHang>(){
           @Override
           public int compare(DonHang o1, DonHang o2){
               return o1.getThanhTien() - o2.getThanhTien();
           }
        });
        for(DonHang x : al){
            System.out.println(x);
        }
    }
}
