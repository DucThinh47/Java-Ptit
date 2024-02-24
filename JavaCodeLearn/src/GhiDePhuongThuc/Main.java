/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GhiDePhuongThuc;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;


class Polygon{
    public void displayInfo(){
        System.out.println("A polygon is a two dimenshional shape with straight lines");
    }
    
    public int getPerimeter(int[] sides){
        int perimeter = 0;
        for(int side : sides){
            perimeter = perimeter + side;
        }
        return perimeter;
    }
}


class Triangle extends Polygon{
    public void displayInfo(){
        System.out.println("A triangle is a polygon with 3 sides");
    }
}

public class Main{
    public static void main(String[] args) {
//        int[] sides = {3,4,5};
//        Polygon p1 = new Polygon();
//        p1.displayInfo();
//        int perimeter = p1.getPerimeter(sides);
//        System.out.println("Perimeter " + perimeter);
        Triangle t1 = new Triangle();
        int[] triangleSides = {8,5,11};
        int perimeter = t1.getPerimeter(triangleSides);
        System.out.println("Triangle Perimeter: " + perimeter);
        t1.displayInfo();
    }
}
