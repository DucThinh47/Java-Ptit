/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.math.BigInteger;
import java.io.File;
import java.io.FileNotFoundException;

public class TachDoiVaTinhTong{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger n = sc.nextBigInteger();
        while(true){
            String s = n.toString();
            if(s.length() == 1)
                break;
            String s1 = s.substring(0, s.length()/2);
            String s2 = s.substring(s.length()/2);
            BigInteger a = new BigInteger(s1);
            BigInteger b = new BigInteger(s2);
            System.out.println(a.add(b));
            n = a.add(b);
        }
    }
}
