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
        int t = sc.nextInt();
        int cnt = 1;
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    b[j][i] = a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Test " + cnt + ": ");
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int tmp = 0;
                    for(int k = 0; k<m; k++){
                        tmp += a[i][k] * b[k][j];
                    }
                    System.out.print(tmp + " ");
                }
                 System.out.println();
            }
            ++cnt;
        }
    }
}
