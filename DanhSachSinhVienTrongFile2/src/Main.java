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
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> al = new ArrayList<>();
        for(int i=1; i<=t; i++){
            sc.nextLine();
            al.add(new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble()));
        }
        for(SinhVien x : al){
            x.in();
            System.out.println();
        }
    }
}