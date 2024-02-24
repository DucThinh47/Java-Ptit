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
    
    public static String solve(String s){
        String res = "";
        String[] arr = s.trim().split("\\s+");
        String tmp = arr[arr.length - 1].toLowerCase();
        for(int i=0; i<arr.length; i++){
            res += tmp + arr[i].toLowerCase().charAt(0);
        }
        return res;
    } 
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Map<String, Integer> mp = new HashMap<>();
        Set<String> se = new LinkedHashSet<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine().trim().toLowerCase();
            String tmp = solve(s);
            if(mp.containsKey(s)){
                mp.put(s, mp.get(s)+1);
            }else{
                mp.put(s, 1);
            }
            
        }
    }
}
