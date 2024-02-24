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
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            List<String> l = Arrays.asList(s.split("\\s"));
            ArrayList<String> al = new ArrayList<>();
            for(String x : l){
                String tmp = new StringBuilder(x).reverse().toString();
                al.add(tmp);
            }
            for(String x : al){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
