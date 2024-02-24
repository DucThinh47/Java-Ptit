/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1GK;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        while (true) {
            String s = n.toString();
            if(s.length() == 1){
                break;
            }
            String tmp = s.substring(0, s.length() / 2);
            String tmp1 = s.substring(s.length() / 2);
            BigInteger a = new BigInteger(tmp);
            BigInteger b = new BigInteger(tmp1);
            System.out.println(a.add(b));
            n = a.add(b);
        }
    }
}
