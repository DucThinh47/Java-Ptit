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
import java.io.IOException;
//import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> al = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        while(sc.hasNextLine()){
            MonHoc a = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if(mp.containsKey(a.getMa())){
                mp.put(a.getMa(), mp.get(a.getMa()) + 1);
            }else{
                mp.put(a.getMa(),1);
            }
            if(mp.get(a.getMa()) == 1){
                al.add(a);
            }
        }
        Collections.sort(al, new Comparator<MonHoc>(){
           @Override
           public int compare(MonHoc o1, MonHoc o2){
               return o1.getMa().compareTo(o2.getMa());
           }
        });
        for(MonHoc x : al){
            System.out.println(x);
        }
    }
}
