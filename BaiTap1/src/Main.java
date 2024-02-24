/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            ArrayList<Integer> al = new ArrayList<>();
            ArrayList<Character> al1 = new ArrayList<>();
            for(int i=0; i<s.length(); i++){
                if(Character.isAlphabetic(s.charAt(i))){
                    al1.add(s.charAt(i));
                }
                if(Character.isDigit(s.charAt(i))){
                    al.add(s.charAt(i)-'0');
                }    
            }
            int sum = 0;
            for(Integer x : al){
                sum += x;
            }
            Collections.sort(al1);
            for(Character x : al1){
                System.out.print(x);
            }
            System.out.print(sum);
            System.out.println();
        }
    }
}
//2
//AC2BEW3
//ACCBA10D2EW30
