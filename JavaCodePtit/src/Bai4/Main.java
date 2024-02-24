/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(new File("INSTITUTION.in"));
        Scanner sc1 = new Scanner(new File("REGISTER.in"));
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, Truong> mp = new HashMap<>();
        while(t-->0){
            Truong a = new Truong(sc.nextLine());
            mp.put(a.getSortName(), a);
        }
        int q = sc1.nextInt();
        sc1.nextLine();
        ArrayList<Team> al = new ArrayList<>();
        while(q-->0){
            String s = sc1.nextLine();
            Team a1 = new Team();
            a1.setTenTruong(s);
            int q1 = sc.nextInt();
            sc.nextLine();
            while(q1-->0){
                String s1 = sc1.nextLine();
                a1.setTenDoi(s1);
                al.add(a1);
            }
        }
        for(Team x : al){
            if(x.getTenTruong().equals(mp.get(x.getTenTruong()).getSortName())){
                System.out.println(x);
            }
        }
    }
}
