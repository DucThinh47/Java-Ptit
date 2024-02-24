/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhKeThua;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

class A{
    public void methodA(){
        System.out.println("Method of class A");
    }
}

class B extends A{
    public void methodB(){
        System.out.println("Method of class B");
    }
}

class C extends B{
    
}

class Main{
    public static void main(String[] args) {
        C obj = new C();
        obj.methodB();
        obj.methodA();
    }
}
