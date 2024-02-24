/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        HashMap<Integer, Integer> mp = new HashMap<>();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            if(!mp.containsKey(n)){
                mp.put(n, 1);
            }else{
                mp.put(n, mp.get(n) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> set = mp.entrySet();
        for(Map.Entry<Integer, Integer> entry : set){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
