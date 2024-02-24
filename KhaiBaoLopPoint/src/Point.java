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

class Point{
    private double x;
    private double y;
    
    public Point(Scanner sc){
        this.x = sc.nextDouble();
        this.y = sc.nextDouble();
    }
    
    public double distance(Point B){
        double tmpx = this.x - B.x;
        double tmpy = this.y - B.y;
        return Math.sqrt(tmpx * tmpx + tmpy * tmpy);
    }
    
}
