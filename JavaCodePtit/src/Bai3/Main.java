/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws  IOException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Matrix a = new Matrix(sc.nextInt(), sc.nextInt());
        }
    }
}
