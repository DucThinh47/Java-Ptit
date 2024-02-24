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
    
    public static int N;
    public static String decToBin(int n){
        String ans = "";
        while(n>0){
            ans = ((char)n + '0') + ans;
            n /= 2;
        }
        while(ans.length() < N){
            ans = "0" + ans;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            N = sc.nextInt();
            int N_2 = (int)Math.pow(2, N);
            for(int i=0; i<N_2; i++){
                System.out.println(decToBin(i));
            }
        }
    }
}
