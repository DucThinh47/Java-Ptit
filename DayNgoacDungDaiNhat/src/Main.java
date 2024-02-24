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
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            int tmp = -1;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '('){
                    st.add(i);
                }else{
                    st.pop();
                    if(st.empty()){
                        st.add(i);
                    }else{
                        tmp = Math.max(tmp, i-st.peek());
                    }
                }
            }
            System.out.println(tmp);
        }
    }
}
//3
//((()
//)()())
//()(()))))