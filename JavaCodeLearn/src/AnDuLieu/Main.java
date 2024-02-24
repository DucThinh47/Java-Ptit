/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnDuLieu;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

class Person{
    private int age;
    
    public void setAge(int age){
        if(age > 0 && age < 100){
            this.age = age;
        }else{
            System.out.println("Invalid Age");
        }
    }
    
    public int getAge(){
        return this.age;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        Person obj = new Person();
        obj.setAge(age);
        System.out.println("Age: " + obj.getAge());
    }
}
