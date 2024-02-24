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
            for(int i=1; i<v.size(); i++){
                String res = v.get(i);
                if(i == v.size()-1){
                    System.out.print(res.substring(0,1).toUpperCase() + res.substring(1));
                }else{
                    System.out.print(res.substring(0,1).toUpperCase() + res.substring(1) + " ");
                }
                
            }
            System.out.print(", " + v.get(0).toUpperCase());
            System.out.println();
        }
    }
}
