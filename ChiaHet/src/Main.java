/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.math.*;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.divide(b);
            BigInteger d = b.divide(a);
            if(a.compareTo(b.multiply(c)) == 0 || b.compareTo(a.multiply(d)) == 0)
                System.out.println("YES");
            else    
                System.out.println("NO");
        }
    }
}
