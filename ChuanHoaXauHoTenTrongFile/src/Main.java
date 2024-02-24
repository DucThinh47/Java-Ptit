/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.File;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            s = s.trim();
            if(s.compareTo("END") == 0)
                break;
            String[] arr = s.split("\\s+");
            String tmp = "";
            for(String x : arr){
                tmp += Character.toUpperCase(x.charAt(0));
                for(int i=1; i<x.length(); i++){
                    tmp += Character.toLowerCase(x.charAt(i));
                }
                tmp += " ";
            }
            System.out.println(tmp);
        }
        sc.close();
    }
}