/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

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
            String s = sc.next();
            String s1 = sc.next();
            if(s.equals(s1)){
                System.out.println(-1);
            }else{
                System.out.println(Math.max(s.length(), s1.length()));
            }
        }
    }
}
