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
        int n = sc.nextInt();
        int[][] a = new int[n][3];
        int cnt = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
            if(sum >= 2){
                ++cnt;
            }
        }
        System.out.println(cnt);
        
    }
}
