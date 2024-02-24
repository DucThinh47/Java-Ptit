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
    
    public static long GCD(long a, long b){
        if(b == 0)
            return a;
        return GCD(b , a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo a = new PhanSo(sc);
        long tmp = GCD(a.getTu(), a.getMau());
        System.out.print(a.getTu() / tmp + "/" + a.getMau() / tmp);
    }
}
