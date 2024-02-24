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
       if(s.length() > 10)
           return true;
       for(int i=0; i<s.length(); i++){
           if(Character.isAlphabetic(s.charAt(i)))
               return true;
       }
       if(Integer.parseInt(s) > Integer.MAX_VALUE && Integer.parseInt(s) < Integer.MAX_VALUE)
           return true;
       return false;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> al = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();   
            String[] arr = s.split("\\s+");
            for(String x : arr){
                if(check(x)){
                    al.add(x);
                }
            }
        }
        Collections.sort(al);
        for(String x : al){
            System.out.print(x + " ");
        }
    }
}
