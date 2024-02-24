/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
public class Polygon {
   private Point[] a;
   private double area1;
   public static double calculateArea(Point[] points) {
        int n = points.length;
        double area = 0;
        for (int i = 0; i < n; i++) {
            Point currentPoint = points[i];
            Point nextPoint = points[(i+1) % n]; // Lấy đỉnh tiếp theo, xem x[i+1] = x[0]
            area += (currentPoint.x * nextPoint.y - currentPoint.y * nextPoint.x);
        }

        return Math.abs(area) / 2.0; // Trả về diện tích dương
    }

    public Polygon(Point[] a) {
        this.a = a;
        this.area1 = calculateArea(a);
    }
    
    public String getArea(){
        return String.format("%.3f", this.area1); 
    }
    

}
