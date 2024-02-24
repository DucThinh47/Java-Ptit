/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangTheoDoiNhapXuatHang;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            KhoHang a = new KhoHang(sc.nextLine(), Double.parseDouble(sc.nextLine()));
            System.out.println(a);
        }
   
    }
}
//3
//A001Y
//1000
//B012N
//2500
//B003Y
//4582
