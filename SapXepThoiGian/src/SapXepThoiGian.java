/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.math.*;
public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Time> al = new ArrayList<>();
        while(t-->0){
            al.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(al, new Comparator<Time>(){
            @Override
            public int compare(Time o1, Time o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if(o1.getH() == o2.getH()){
                    if(o1.getM() == o2.getM()){
                        return o1.getS() - o2.getS();
                    }else{
                        return o1.getM() - o2.getM();
                    }
                }else{
                    return o1.getH() - o2.getH();
                }
            }
            
        });
        for(Time x : al){
            System.out.println(x);
        }
    }
}
//3
//11 20 20
//14 20 14
//11 15 12