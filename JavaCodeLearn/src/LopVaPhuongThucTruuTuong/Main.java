/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LopVaPhuongThucTruuTuong;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

interface MotorBike{
    abstract void brake();
}

class SportsBike implements MotorBike{
    public void brake(){
        System.out.println("Working of brake on Sports Bikes");
        System.out.println("Stopping Sports Bikes");
    }
}

class MountainBike implements MotorBike{
    public void brake(){
        System.out.println("Working of brake on Mountain Bikes");
        System.out.println("Stopping Mountain Bikes");
    }
}

class Main{
    public static void main(String[] args) {
        SportsBike s1 = new SportsBike();
        s1.brake();
        MountainBike m1 = new MountainBike();
        m1.brake();
    }
}