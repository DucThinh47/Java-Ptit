/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n = sc.nextInt(), m = sc.nextInt(), i = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            int[][] a = new int[n+1][m+1];
            for(int k=1; k<=n; k++){
                for(int j=1; j<=m; j++){
                    a[k][j] = sc.nextInt();
                    if(j == i){
                        al.add(a[k][j]);
                    }
                }
            }
            int l = 0;
            Collections.sort(al);
            for(int k=1; k<=n; k++){
                for(int j=1; j<=m; j++){
                    if(j == i){
                        System.out.print(al.get(l) + " ");
                        ++l;
                    }else{
                        System.out.print(a[k][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
