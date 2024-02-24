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
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> mp = new HashMap<>();
        while(t-->0){
            String s = sc.nextLine();
            String tmp = "";
            Vector<String> v = new Vector<>();
            s = s.toLowerCase() + " ";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == ' '){
                    if(tmp != ""){
                        v.add(tmp);
                        tmp = "";
                    }
                }else{
                    tmp += s.charAt(i);
                }
            }
            String s1 = v.get(v.size() - 1);
            for(int i=0; i<v.size() - 1; i++){
                s1 += v.get(i).substring(0 , 1);
            }
            if(mp.get(s1) == null){
                mp.put(s1, 1);
                tmp = "";
            }else{
                tmp = Integer.toString(mp.get(s1) + 1);
                mp.put(s1, mp.get(s1) + 1);
            }
            System.out.println(s1 + tmp + "@ptit.edu.vn");
        }
    }
}

