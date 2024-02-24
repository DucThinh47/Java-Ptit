/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[1001];
            int[] cntChan = new int[1001];
            int[] cntLe = new int[1001];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                if(arr[i] % 2 == 0){
                    cntChan[arr[i]]++;
                }else{
                    cntLe[arr[i]]++;
                }
            }
            for(int i=1; i<1001; i++){
                if(cntChan[i] != 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            for(int i=1000; i>0; i--){
                if(cntLe[i] != 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
//1
//7
//3 7 12 8 5 4 888
