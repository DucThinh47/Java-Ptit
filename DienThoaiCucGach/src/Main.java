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
    
    static char solve(char c){
        if(c == 'a' || c == 'b' || c == 'c'){
            return '2';
        }else if(c == 'd' || c == 'e' || c == 'f'){
            return '3';
        }else if(c == 'g' || c == 'h' || c == 'i'){
            return '4';
        }else if(c == 'j' || c == 'k' || c == 'l'){
            return '5';
        }else if(c == 'm' || c == 'n' || c == 'o'){
            return '6';
        }else if(c == 'p' || c == 'q' || c == 'r' || c == 's'){
            return '7';
        }else if(c == 't' || c == 'u' || c == 'v'){
            return '8';
        }
        return '9';
    }
    
    static boolean check(String s){
        String tmp = new StringBuilder(s).reverse().toString();
        return s.equals(tmp);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            s = s.toLowerCase();
            String tmp = "";
            for(int i=0; i<s.length(); i++){
                tmp += solve(s.charAt(i));
            }
            if(check(tmp)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
