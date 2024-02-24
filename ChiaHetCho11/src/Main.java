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
            String s = sc.next();
            long sum = 0;
            for(int i=0; i<s.length(); i++){
                if(i % 2 == 0){
                    sum += s.charAt(i) -'0';
                }else{
                    sum -= s.charAt(i) -'0';
                }
            }
            if(sum % 11 == 0){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
