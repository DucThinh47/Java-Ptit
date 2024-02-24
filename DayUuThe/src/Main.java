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
import java.lang.*;
public class Main {
    
    static boolean check(String[] s){
        int demChan = 0, demLe = 0;
        for(int i=0; i<s.length; i++){
            if(Integer.parseInt(s[i]) % 2 == 0){
                demChan++;
            }else{
                demLe++;
            }
        }
        int tmp = demChan + demLe;
        if((tmp % 2 == 0 && demChan > demLe) || (tmp % 2 != 0 && demLe > demChan)){
            return true;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String[] tmp = s.split(" ");
            if(check(tmp))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
