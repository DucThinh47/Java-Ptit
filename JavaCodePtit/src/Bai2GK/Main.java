/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2GK;

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
            if(s.charAt(i) -'0' < s.charAt(i+1) -'0')
                return false;
        }
        return true;
    }
    
    
    public static void main(String[] args)throws IOException, ClassNotFoundException {
//        Scanner sc = new Scanner(new File("DATA1.in"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> al = (ArrayList<Integer>)ois.readObject();
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al1 = (ArrayList<Integer>)ois1.readObject();
        int[] arr = new int[100001];
        int[] arr1 = new int[100001];
        for(Integer x : al){
            if(check(x)){
                arr[x]++;
            }
        }
        for(Integer x : al1){
            if(check(x)){
                arr1[x]++;
            }
        }
        for(int i=10; i<=9999; i++){
            if(arr[i] != 0 && arr1[i] != 0){
                System.out.println(i + " " + arr[i] + " " + arr1[i]);
            }
        }
    }
}
