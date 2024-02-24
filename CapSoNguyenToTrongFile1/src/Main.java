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
        for(int i=2; i*i <= n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> al1 = (ArrayList<Integer>)sc1.readObject();
        ArrayList<Integer> al2 = (ArrayList<Integer>)sc2.readObject();
        Set<Integer> se1 = new TreeSet<>();
        Set<Integer> se2 = new TreeSet<>();
        for(Integer x : al1){
            if(isPrime(x)){
                se1.add(x);
            }
        }
        for(Integer y : al2){
            if(isPrime(y)){
                se2.add(y);
            }
        }
        for(Integer x : se1){
            if(x >= 500000){
                break;
            }
            if(se2.contains(1000000 - x)){
                System.out.println(x + " " + (1000000 - x));
            }
        }
        sc1.close();
        sc2.close();
    }
}
