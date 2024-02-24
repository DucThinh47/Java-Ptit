/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[t];
        for(int i=0; i<t; i++){
            arr[i] = sc.nextLine();
        }
        Arrays.sort(arr);
        for(String x : arr){
            System.out.println(x);
        }
    }
}
