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
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonThi> al = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        while(sc.hasNextLine()){
            MonThi a = new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(mp.containsKey(a.getMa())){
                mp.put(a.getMa(), mp.get(a.getMa()) + 1);
            }else{
                mp.put(a.getMa(), 1);
            }
            if(mp.get(a.getMa()) == 1){
                al.add(a);
            }
        }
        Collections.sort(al, new Comparator<MonThi>(){
            @Override
            public int compare(MonThi o1, MonThi o2){
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(MonThi x : al){
            System.out.println(x);
        }
    }
}
