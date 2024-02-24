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
            long k = sc.nextLong();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            int flag = 0;
            long sum = 0;
            int index = 0;
            //1 4 20 3 10 5
            for(int i=0; i<n; i++){
                //i = 0 1 2 3 4
                //sum = 1 5 25 28 38 
                sum += a[i];
                while(sum > k && index < i){
                    sum = sum - a[index];//sum = 37 - a[2] = 33
                    index++;//index = 2
                }
                if(sum == k){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
