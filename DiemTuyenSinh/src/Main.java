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
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> al = new ArrayList<>();
        while(t-->0){
            al.add(new ThiSinh(sc.nextLine(), Double.parseDouble(sc.nextLine()) , sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if(o1.getTongDiem() == o2.getTongDiem()){
                    return o1.getMa().compareTo(o2.getMa());
                }else{
                    if(o1.getTongDiem() - o2.getTongDiem() < 0)
                        return 1;
                    else
                        return -1;
                }
            }
            
        });
        for(ThiSinh x : al){
            System.out.println(x);
        }
    }
}