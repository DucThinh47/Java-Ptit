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
        int a;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                a = sc.nextInt();
                if(i <= j && a == 1){
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }
    }
}
