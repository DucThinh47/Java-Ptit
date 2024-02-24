/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        //<<PI<T>>Ta-
        for(int i=0; i<s.length(); i++){
            //i = 0 1 2 3 4 5 6 7 8
            if(s.charAt(i) == '-'){
                if(!st1.empty()){
                    st1.pop();
                    
                }
            }else if(s.charAt(i) == '<'){
                if(!st1.empty()){
                    st2.push(st1.peek());
                    //st2 = I 
                    st1.pop();//st1 = P
                }
            }else if(s.charAt(i) == '>'){
                if(!st2.empty()){
                    st1.push(st2.peek());
                    //st1 = P T I
                    st2.pop();//st2 = emp
                }
            }else{
                st1.push(s.charAt(i));
                //st1 = P T I T
            }
        }
        while(!st1.empty()){
            st2.push(st1.peek());//st2 = TITP
            st1.pop();
        }
        while(!st2.empty()){
            System.out.print(st2.peek());//PTIT
            st2.pop();
        }
    }
}