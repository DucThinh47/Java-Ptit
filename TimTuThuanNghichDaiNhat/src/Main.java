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
        String tmp = new StringBuilder(s).reverse().toString();
        if(tmp.compareTo(s) == 0)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> mp = new LinkedHashMap<>();
        int maxx = 0;
        while(sc.hasNext()){
            String s = sc.nextLine();
            if(check(s)){
                if(s.length() > maxx)
                    maxx = s.length();
                if(mp.containsKey(s)){
                    mp.put(s, mp.get(s) + 1);
                }else{
                    mp.put(s, 1);
                }
            }
            if(s.isEmpty())
                break;
        }
        Set<Map.Entry<String,Integer>> se = mp.entrySet();
        for(Map.Entry<String,Integer> x : se){
            if(x.getKey().length() == maxx){
                System.out.println(x.getKey() + " " + x.getValue());
            }
        }
    }
}
