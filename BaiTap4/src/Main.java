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
        Set<String> s1 = new TreeSet<>();
        Set<String> s2 = new TreeSet<>();
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for(String x : a){
                s1.add(x.toLowerCase());
            }
        }
        t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            for(String x : a){
                s2.add(x.toLowerCase());
            }
        }
        Set<String> tmp1 = new TreeSet<>(s1);
        tmp1.removeAll(s2);
        Set<String> tmp2 = new TreeSet<>(s2);
        tmp2.removeAll(s1);
        for(String x : tmp1){
            System.out.print(x + " ");
        }
        System.out.println();
        for(String x : tmp2){
            System.out.print(x + " ");
        }
    }
}
//2
//Lap trinh huong doi tuong
//ngon ngu lap trinh C++
//2
//lap trinh co ban
//lap trinh huong thanh phan