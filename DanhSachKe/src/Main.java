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
        int n = sc.nextInt();
        Vector<Vector<Integer>> v = new Vector<>();
        for(int i=1; i<=n; i++){
            Vector<Integer> a = new Vector<>();
            for(int j=1; j<=n; j++){
                int x = sc.nextInt();
                if(x == 1){
                    a.add(j);
                }
            }
            v.add(a);
        }
        for(int i=0; i<n; i++){
            System.out.print("List" + "(" + (i+1) + ") " + "= ");
            for(int j=0; j<v.get(i).size(); j++){
                System.out.print(v.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
