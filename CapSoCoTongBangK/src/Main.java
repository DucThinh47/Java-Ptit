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
        int t = sc.nextInt();
        while(t-->0){
           int n = sc.nextInt();
           int k = sc.nextInt();
           int[] a = new int[n];
           int cnt = 0;
           for(int i=0; i<n; i++){
               a[i] = sc.nextInt();
           }
           for(int i=0; i<n-1; i++){
               for(int j=i+1; j<n; j++){
                   if(a[i] + a[j] == k){
                       ++cnt;
                   }
               }
           }
            System.out.println(cnt);
        }
    }
}
