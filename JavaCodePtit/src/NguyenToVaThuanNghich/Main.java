/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NguyenToVaThuanNghich;

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
    
    static boolean thuanNghich(int n){
        String s = Integer.toString(n);
        String tmp = new StringBuilder(s).reverse().toString();
        if(tmp.equals(s))
            return true;
        return false;
    }
    
    
    public static void main(String[] args) throws IOException , ClassNotFoundException      {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al = (ArrayList<Integer>)ois.readObject();
        ArrayList<Integer> al1 = (ArrayList<Integer>)ois1.readObject();
        Collections.sort(al);
        Collections.sort(al1);
        int[] cnt = new int[100001];
        int[] cnt1 = new int[100001];
        for(Integer x : al){
            if(isPrime(x) && thuanNghich(x)){
                cnt[x]++;
            }
        }
        for(Integer x : al1){
            if(isPrime(x) && thuanNghich(x)){
                cnt1[x]++;
            }
        }
        for(int i=10; i<=9999; i++){
            if(cnt[i] != 0 && cnt1[i] != 0){
                System.out.println(i + " " + cnt[i] + " " + cnt1[i]);
            }
        }
    }
}
