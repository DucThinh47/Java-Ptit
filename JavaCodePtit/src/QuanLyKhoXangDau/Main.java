/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyKhoXangDau;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            XangDau x = new XangDau(sc.nextLine());
            System.out.println(x);
        }
    }
}
//3
//N89TN 4500
//D00BP 3500
//X92SH 2600
