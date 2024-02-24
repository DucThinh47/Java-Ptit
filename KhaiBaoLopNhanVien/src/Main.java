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
        NhanVien a = new NhanVien(sc);
        System.out.print(a.getMnv() + " " + a.getTen() + " " + a.getGt() + " " + a.getDob() + " " + a.getAdr() + " " + a.getMst() + " " + a.getHd());
    }
}
