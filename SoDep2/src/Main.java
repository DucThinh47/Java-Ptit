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
    
    static boolean check(int n){
        String s = Integer.toString(n);
        if(s.length() < 2){
            return false;
        }
        for(int i=0; i<s.length()-1; i++){
            if((s.charAt(i)-'0') < (s.charAt(i+1)-'0')){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al1 = (ArrayList<Integer>)sc1.readObject();
        ArrayList<Integer> al2 = (ArrayList<Integer>)sc2.readObject();
        int[] cnt1 = new int[100001];
        int[] cnt2 = new int[100001];
        for(Integer x : al1){
            if(check(x)){
                cnt1[x]++;
            }
        }
        for(Integer y : al2){
            if(check(y)){
                cnt2[y]++;
            }
        }
        for(int i=10; i<=9999; i++){
            if(cnt1[i] != 0 && cnt2[i] != 0){
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }
    }
}
