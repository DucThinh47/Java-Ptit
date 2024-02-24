/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ThiSinh> al = new ArrayList<>();
        while(sc.hasNext()){
            al.add(new ThiSinh(sc));
        }
        Collections.sort(al, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2){
                return o1.getTenThiSinh().compareTo(o2.getTenThiSinh());
            }
        });
        for(ThiSinh x : al){
            System.out.println(x);
        }
    }
}
//2
//BAV_MIS
//Banking Academy of Vietnam
//FTU Knights1
//Foreign Trade University
//6
//Le Trung Toan
//Team01
//Nguyen Trinh Quoc Long
//Team01
//Giang Minh Tung
//Team01
//Nguyen Hang Giang
//Team02
//Nguyen Thanh Nhan
//Team02
//Nguyen Viet Duc
//Team02
