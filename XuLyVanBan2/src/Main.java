/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    
    static boolean check(String s){
        String s1 = ".,!?:";
        for(char x : s1.toCharArray()){
            if(s.contains(Character.toString(x))){
                return false;
            }
        }
        return true;
    }
    
    public static boolean check2(String s){
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> se = new TreeSet<>();
        while(sc.hasNext()){
            String s = sc.next();
            if(check(s) && check2(s)){
                se.add(s);
            }
        }
        for(String x : se){
            System.out.println(x);
        }
    }
}
