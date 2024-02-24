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
class Rectange {
    private double width;
    private double height;
    private String color;
    
    public Rectange(Scanner sc){
        this.width = sc.nextDouble();
        this.height = sc.nextDouble();
        String s = sc.next();
        this.color = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public String getColor(){
        return this.color;
    }
    public double findArea(){
        return this.width * this.height;
    }
    public double findPerimeter(){
        return ((this.width + this.height) * 2);
    }
    public boolean check(){
        int tmp = (int)this.width;
        int tmp1 = (int)this.height;
        if(tmp <= 0 || tmp1 <= 0)
            return false;
        return true;
    }
    public void in(){
        if(!check()){
            System.out.print("INVALID");
        }else{
            System.out.print((int)findPerimeter() + " " + (int)findArea() + " " + getColor());
        }
    }
}
