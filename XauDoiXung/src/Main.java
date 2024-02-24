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
    
    static boolean check(String s){
        int cnt = 0;
        for(int i=0; i<s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                ++cnt;
            }
        }
        if((s.length() % 2 == 0 && cnt == 1) || (s.length() % 2 != 0 && cnt <= 1)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
