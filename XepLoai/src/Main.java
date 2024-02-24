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
public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<BangDiem> al = new ArrayList<>();
        while(t-->0){
            al.add(new BangDiem(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2){
                if(o1.getDiemTong() < o2.getDiemTong()){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(BangDiem x : al){
            System.out.println(x);
        }
    }
}