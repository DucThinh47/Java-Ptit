/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main{
    public static void main(String[] args) throws IOException , ParseException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Online> al = new ArrayList<>();
        while(t-->0){
            al.add(new Online(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<Online>(){
           @Override
           public int compare(Online o1, Online o2){
               if(o1.getOnline() == o2.getOnline()){
                   return o1.getTen().compareTo(o2.getTen());
               }else{
                   if(o1.getOnline() - o2.getOnline() < 0){
                       return 1;
                   }else{
                       return -1;
                   }
               }
           }
        });
        for(Online x : al){
            System.out.println(x);
        }
    }
}