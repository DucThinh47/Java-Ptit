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
    
    public static String tmp;
    
    public static void solve(int n){
        Queue<String> q = new LinkedList<>();
        q.add("9");
        while(!q.isEmpty()){
            String s = q.poll();
            int a = Integer.parseInt(s);
            if(a % n == 0){
                tmp = s;
                break;
            }
            String s1 = s + "0";
            String s2= s + "9";
            q.add(s1);
            q.add(s2);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            solve(n);
            System.out.println(tmp);
        }
    }
}