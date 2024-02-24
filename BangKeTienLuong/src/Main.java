/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> al = new ArrayList<>();
        long sum = 0;
        while(t-->0){
            al.add(new NhanVien(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), sc.nextLine()));
        }
        for(NhanVien x : al){
            sum += x.getThucLinh();
            System.out.println(x);  
        }
        System.out.println("Tong chi phi tien luong: " + sum);
    }
}
//5
//Cao Van Vu
//50000
//26
//GD
//Bui Thi Trang
//45000
//23
//PGD
//Do Van Truong
//40000
//25
//PGD
//Nguyen Van Cam
//37000
//26
//TP
//Truong Thi Tu Linh
//45000
//22
//NV
