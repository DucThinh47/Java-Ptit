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
        ArrayList<SanPham> al = new ArrayList<>();
        while(t-->0){
            al.add(new SanPham(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2){
                return o2.getChietKhau() - o1.getChietKhau();
            }
        });
        for(SanPham x : al){
            System.out.println(x);
        }
    }
}
