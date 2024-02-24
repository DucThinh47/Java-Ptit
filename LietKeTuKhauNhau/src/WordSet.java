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
public class WordSet{
    private Set<String> set;
    
    public WordSet(String name) throws IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        this.set = new TreeSet<>();
        while(sc.hasNext()){
            set.add(sc.next().toLowerCase());
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        for(String x : set){
            res += x + "\n";
        }
        return res;
    }
}
