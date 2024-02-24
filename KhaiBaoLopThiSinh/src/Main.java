/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh a = new ThiSinh(sc);
        float tmp = a.getM1() + a.getM2() + a.getM3();
        System.out.print(a.getTen() + " " + a.getNs() + " ");
        System.out.printf("%.1f", tmp);
    }
}
