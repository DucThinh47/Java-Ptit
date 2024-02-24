/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> se = new HashSet<>();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            se.add(a[i]);
        }
        for(Integer x : se){
            System.out.println(x);
        }
    }
}
