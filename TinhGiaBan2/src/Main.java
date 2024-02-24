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
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> al = new ArrayList<>();
        while(t-->0){
            al.add(new SanPham(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2){
                if(o1.getGiaBanle() - o2.getGiaBanle() < 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(SanPham x : al){
            System.out.println(x);
        }
    }
}
//4
//DUONG
//KG
//7500
//150
//TRUNG
//CHUC
//10000
//225
//GAO
//KG
//14000
//118
//SUA
//HOP
//48000
//430
