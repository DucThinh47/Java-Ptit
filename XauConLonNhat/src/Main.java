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
        String s = sc.next();
        String res = "";
        char c = 'a';
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) >= c){
                c = s.charAt(i);
                res = c + res;
            }
        }
        System.out.println(res);
    }
}
