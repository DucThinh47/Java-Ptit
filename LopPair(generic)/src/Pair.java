/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first , S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
  
    public boolean check(int n){
        if(n < 2){
            return false;
        }
        for(int i=2; i*i<=n; i++){
            if(n % i == 0){
                return false;
            }
            
        }
        return true;
    }
    
    public boolean isPrime(){
        if(check((Integer)this.first) && check((Integer)this.second)){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return this.first + " " + this.second;
    }
}
