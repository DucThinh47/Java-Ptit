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
    
    static boolean check(String s, int k){
        Set<Character> se = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            se.add(s.charAt(i));
        }
        if(s.length() >= 26 && (k + se.size()) >= 26)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.next();
            int k = sc.nextInt();
            if(check(s,k)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}


//2
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//4
//qwqqwqeqqwdsdadsdasadsfsdsdsdasasas
//24

