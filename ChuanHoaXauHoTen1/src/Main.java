/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            String tmp = "";
            Vector<String> v = new Vector<>();
            s = s.toLowerCase() + " ";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == ' '){
                    if(tmp != ""){
                        v.add(tmp);
                        tmp = "";
                    }
                }else{
                    tmp += s.charAt(i);
                }
            }
            for(int i=0; i<v.size(); i++){
                String s1 = v.get(i);
                System.out.print(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " ");

            }
            System.out.println();
        }
    }
}
