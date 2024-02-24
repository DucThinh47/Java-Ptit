/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Triangle {
    private double a,b,c;
    
    public Triangle(Point x, Point y, Point z){
        this.a = x.kc(y);
        this.b = x.kc(z);
        this.c = y.kc(z);
    }
    
    public boolean valid(){
        if(this.a + this.b > this.c && this.a + this.c > this.b && this.b + this.c > this.a)
            return true;
        return false;
    }
    
    public String getPerimeter(){
        return String.format("%.3f", this.a + this.b + this.c);
    }
}
