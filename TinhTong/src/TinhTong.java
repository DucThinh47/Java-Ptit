/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TinhTong{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                sum += Long.parseLong(s);
            }catch(Exception e){
                
            }
        }
        System.out.println(sum);
    }
}
//12 3 4 5 6 7
//Aaa 1 1 Bbb XXX yyy 5 5
//999999999999999999999999
//9