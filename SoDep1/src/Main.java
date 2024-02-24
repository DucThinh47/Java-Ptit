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
            if((s.charAt(i)-'0') > (s.charAt(i+1)-'0')){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)throws IOException, ClassNotFoundException, FileNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al1 = (ArrayList<Integer>)sc1.readObject();
        ArrayList<Integer> al2 = (ArrayList<Integer>)sc2.readObject();
        int[] arr1 = new int[100001];
        int[] arr2 = new int[100001];
        for(Integer x : al1){
            if(check(x)){
                arr1[x]++;
            }
        }
        for(Integer y : al2){
            if(check(y)){
                arr2[y]++;
            }
        }
        for(int i=10; i<=9999; i++){
            if(arr1[i] != 0 && arr2[i] != 0){
                System.out.println(i + " " + arr1[i] + " " + arr2[i]);
            }
        }
    }
}
