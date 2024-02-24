/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Truong {
    private String sort_name, full_name;
    
    public Truong(String line){
        String[] arr = line.trim().split("\\s++");
        this.sort_name = arr[0];
        for(int i=1; i<arr.length; i++){
            this.full_name += arr[i];
        }
    }
    
    public String getSortName(){
        return this.sort_name;
    }
    
    public String getFullName(){
        return this.full_name;
    }
}
