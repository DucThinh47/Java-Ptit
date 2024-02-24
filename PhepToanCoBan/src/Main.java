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
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        ArrayList<BigInteger> al = new ArrayList<>();
        BigInteger sum = BigInteger.ZERO;
        for(int i=0; i<n; i++){
            BigInteger x = sc.nextBigInteger();
            al.add(x);
        }
        for(BigInteger x : al){
            sum = sum.add(x);
        }
        Collections.sort(al);
        System.out.println(al.get(0));
        System.out.println(al.get(al.size()-1));
        System.out.println(sum);
    }
}
