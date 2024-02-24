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
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<HoTen> al = new ArrayList<>();
        while(sc.hasNext()){
            al.add(new HoTen(sc.nextLine()));
        }
        Collections.sort(al, new Comparator<HoTen>(){
            @Override
            public int compare(HoTen o1, HoTen o2){
                if(o1.getTen().compareTo(o2.getTen()) == 0){
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }else{
                    return o1.getTen().compareTo(o2.getTen());
                }
            }
        });
        for(HoTen x : al){
            System.out.println(x);
        }
    }
}
