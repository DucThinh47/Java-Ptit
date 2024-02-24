/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauLacBoBongDa1;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        Map<String, CLB> mp = new HashMap<>();
        while(t-->0){
            CLB c = new CLB(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mp.put(c.getMa(), c);
        }
        int q = sc.nextInt();
        sc.nextLine();
        ArrayList<TranDau> al = new ArrayList<>();
        while(q-->0){
            TranDau a = new TranDau(sc.nextLine());
            al.add(a);
        }
        for(TranDau x : al){
            System.out.println(x.getMa_tran() + " " + mp.get(x.getMa_clb()).getTen() + " " + x.getDoanh_thu(mp.get(x.getMa_clb()).getGia_ve()));
        }
    }
    
}
//2
//AC
//AC Milan
//12
//MU
//Manchester United
//10
//2
//IAC1 80000
//EMU2 60000
