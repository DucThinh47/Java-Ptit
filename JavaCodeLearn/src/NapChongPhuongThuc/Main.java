/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NapChongPhuongThuc;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;


class Addition{
    void add(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("Sum of 2 digits: " + sum);
    }
    
    void add(int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        System.out.println("Sum of 3 digits: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(5,1);
        obj.add(9,11,6);
    }
}
