/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String s1 = sc.nextLine();
            HashSet<String> hs = new HashSet<>();
            List<String> l = Arrays.asList(s.split("\\s"));
            List<String> l1 = Arrays.asList(s1.split("\\s"));
            for(String x : l){
                if(!l1.contains(x)){
                    hs.add(x);
                }
            }
            for(String x : hs){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
