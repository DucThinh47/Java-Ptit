/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[100001];
        for(int i=0; i<n-1; i++){
            int u = sc.nextInt(), v = sc.nextInt();
            cnt[u]++;
            cnt[v]++;
        }
        for(int i=1; i<=n; i++){
            if(cnt[i] == 0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
//5
//1 2
//1 3
//1 4
//1 5
