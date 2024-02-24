/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoLocPhat;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static ArrayList<String> al = new ArrayList<>();
    
    
    static void locPhat(int n){
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        while(!q.isEmpty()){
            String s = q.poll();
            if(s.length() > n){
                break;
            }
            al.add(s);
            String s1 = s + "6";
            String s2 = s + "8";
            q.add(s1);
            q.add(s2);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            locPhat(n);
            Collections.sort(al, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2){
                    if(o1.length() == o2.length()){
                        return o2.compareTo(o1);
                    }else{
                        return o2.length() - o1.length();
                    }
                }
            });
            System.out.println(al.size());
            for(String x : al){
                System.out.print(x + " ");
            }
            System.out.println();
            al.clear();
        }
    }
}