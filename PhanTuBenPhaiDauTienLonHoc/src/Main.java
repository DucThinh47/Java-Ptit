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
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] tmp = new int[n];
//            tmp[n-1] = -1;
            Stack<Integer> st = new Stack<>();
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            st.add(0);
            for(int i=1; i<n; i++){
                while(!st.empty() && a[st.peek()] < a[i]){
                    int index = st.pop();
                    tmp[index] = a[i];
                }
                st.add(i);
            }
            while(!st.empty()){
                tmp[st.peek()] = -1;
                st.pop();
            }
            for(int i=0; i<n; i++){
                System.out.print(tmp[i] + " ");
            }
            System.out.println();
        }
    }
}
//3
//4
//4 5 2 25
//3
//2 2 2
//4
//4 4 5 5