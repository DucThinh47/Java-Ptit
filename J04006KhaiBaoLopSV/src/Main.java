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
        SinhVien s = new SinhVien();
        s.set(sc);
        System.out.print(s.getMsv() + " " + s.getTen() + " " + s.getLop() + " " + s.getDob() + " ");
        System.out.printf("%.2f", s.getGpa());
    }
}
