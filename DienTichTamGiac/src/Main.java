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
            Point A = new Point(sc);
            Point B = new Point(sc);
            Point C = new Point(sc);
            if(C.check(A, B)){
                System.out.printf("%.2f", C.area());
                System.out.println();
            }else{
                System.out.println("INVALID");
            }
        }
    }
}
