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
    public static boolean check(int n){
        String s = Integer.toString(n);
        if(s.length() < 3){
            return false;
        }
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> al = (ArrayList<Integer>) ois.readObject();
        Set<Integer> set = new TreeSet<>();
        for(Integer x : al){
            if(check(x)) set.add(x);
        }
        for(Integer x : set){
            System.out.println(x);
        }
    }
}
