/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhDongGoi;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

class Rectangle{
    int length;
    int breadth;
    
    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    public void calculateArea(){
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(12, 9);
        obj.calculateArea();
    }
}
