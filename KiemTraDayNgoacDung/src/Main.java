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
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.next();
            Stack<Character> st = new Stack<>();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                    st.add(s.charAt(i));
                }else{
                    if(!st.empty()){
                        Character c = st.peek();
                        if((s.charAt(i) == ')' && c == '(') || (s.charAt(i) == ']' && c == '[') || (s.charAt(i) == '}' && c == '{')){
                            st.pop();
                        }
                    }
                }
            }
            if(st.size() == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
//2
//[()]{}{[()()]()}
//[(])