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
    
    static String fibo(int n, long k, long[] a){
        if(n == 1)
            return "0";
        if(n == 2)
            return "1";
        if(k <= a[n-2])
            return fibo(n-2,k,a);
        return fibo(n-1, k - a[n-2], a);
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] dp = new long[93];
        dp[0] = dp[1] = 1;
        for(int i=2; i<=92; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(fibo(n,k,dp));
        }
    }
}
