/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> al = (ArrayList<Integer>) in.readObject();
        int[] cnt = new int[1000001];
        for(Integer x : al){
            cnt[x]++;
        }
        for(int i=0; i<1000; i++){
            System.out.println(i + " " + cnt[i]);
        }
    }
}




