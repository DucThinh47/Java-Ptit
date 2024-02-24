/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.math.*;
class Point {
    private double x, y;
    private double a,b,c;
    
    public Point(Scanner sc){
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    
    public double area(){
        return Math.sqrt((a + b + c)*(a + b - c)*(b + c - a)*(c + a - b))/4;
    }
    
    public boolean check(Point A, Point B){
        this.a = Math.sqrt((A.x - B.x)*(A.x - B.x) + (A.y - B.y) * (A.y - B.y));
        this.b = Math.sqrt((B.x - this.x) * (B.x - this.x) + (B.y - this.y) * (B.y - this.y));
        this.c = Math.sqrt((A.x - this.x) * (A.x - this.x) + (A.y - this.y) * (A.y - this.y));
        if(a + b > c && a + c > b && b + c > a)
            return true;
        return false;
    }
}
