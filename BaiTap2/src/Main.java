/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while(t-->0){
            Queue<Integer> q = new LinkedList<>();
            int n = sc.nextInt();
            int[] a = new int[21];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for(int x : a){
                q.add(x);
            }
            long x = 0, y = 0;
            boolean check = false;
            while(!q.isEmpty()){
                if(!check){
                    x = x * 10 + q.peek();
                }else{
                    y = y * 10 + q.peek();
                }
                q.poll();
                check = !check;
            }
            System.out.println(x + y);
        }
    }
}
