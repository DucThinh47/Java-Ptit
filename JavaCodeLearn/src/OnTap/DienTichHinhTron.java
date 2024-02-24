/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

class Area{
    private double radius;
    
    public void setRadius(double radius){
        if(radius > 0){
            this.radius = radius;
        }else{
            System.out.println("Radius is negative");
        }
    }
    
    public double getRadius(){
        return this.radius;
    }
}

public class DienTichHinhTron {
    public static void main(String[] args) {
        Area area = new Area();
        System.out.println("Enter the value of radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        area.setRadius(radius);
        double circleArea = 3.14 * area.getRadius() * area.getRadius();
        System.out.println("Area of Circle: " + circleArea);
    }
}
