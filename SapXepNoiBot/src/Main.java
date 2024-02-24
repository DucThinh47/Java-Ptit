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
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=n-1; i>=0; i--){
            int flag = 0;
            for(int j=0; j<i; j++){
                if(a[j+1] < a[j]){
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                }else{
                    flag++;
                }
            }
            if(flag == i){
                return;
            }
            System.out.print("Buoc " + (n-i) + ": ");
            for(int k=0; k<n; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}
