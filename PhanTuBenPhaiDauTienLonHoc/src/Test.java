/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            st.add(a[i]);
        }
        int tmp = st.pop();
        System.out.println(tmp);
        int res = st.peek();
        System.out.println(res);
    }
}
