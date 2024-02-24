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
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> se1 = new TreeSet<>();
        Set<Integer> se2 = new TreeSet<>();
        Set<Integer> se3 = new TreeSet<>();
        Set<Integer> se4 = new TreeSet<>();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            se1.add(a[i]);
            se3.add(a[i]);
        }
        for(int j=0; j<m; j++){
            b[j] = sc.nextInt();
            if(se1.contains(b[j])){
                se2.add(b[j]);
            }
            se4.add(b[j]);
        }
        for(Integer x : se2){
                System.out.print(x + " ");
            
        }
        System.out.println();
        se1.removeAll(se4);
        se4.removeAll(se3);
        for(Integer x : se1){
           
                System.out.print(x + " ");
            
        }
        System.out.println();
        for(Integer x : se4){
                System.out.print(x + " ");
            
        }
    }
}
//5 6
//1 2 3 4 5
//3 4 5 6 7 8
