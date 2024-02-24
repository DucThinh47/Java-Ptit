/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Pair <T0, T1>{
    T0 first;
    T1 second;
    
    public Pair(T0 first, T1 second){
        this.first = first;
        this.second = second;
    }
    
    public static boolean prime(int n){
        if(n < 2)
            return false;
        for(int i=2; i*i<=n; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    public boolean isPrime(){
        return prime((Integer)this.first) && prime((Integer)this.second);
    }
    
    @Override
    public String toString(){
        return this.first + " " + this.second;
    }
}
