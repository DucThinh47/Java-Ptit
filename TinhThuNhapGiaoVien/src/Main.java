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
        GiaoVien a = new GiaoVien(sc);
        System.out.print(a.getMgv() + " " + a.getTen() + " " + a.getBacLuong() + " " + a.getPhuCap() + " " + a.getThuNhap());
    }
}
