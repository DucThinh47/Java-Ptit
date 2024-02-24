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
    
    static boolean isPrime(int n){
        if(n < 2)
            return false;
        for(int i=2; i*i<=n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> al = (ArrayList<Integer>) in.readObject();
        int[] cnt = new int[10000];
        for(Integer x : al){
            cnt[x]++;
        }
        for(int i=0; i<10000; i++){
            if(isPrime(i)){
                System.out.println(i + " " + cnt[i]);
            }
        }
    }
}
