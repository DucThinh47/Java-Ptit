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

interface MotorBike{
    abstract void brake();
}

class SportsBike implements MotorBike{
    public void brake(){
        System.out.println("Stopping the Sports Bike.");
    }
}

class MountainBike implements MotorBike{
    public void brake(){
        System.out.println("Stopping the Mountain Bike.");
    }
}

public class TrienKhaiHeThongPhanhXeMay {
    public static void main(String[] args) {
        SportsBike s1 = new SportsBike();
        s1.brake();
        MountainBike m1 = new MountainBike();
        m1.brake();
    }
}
