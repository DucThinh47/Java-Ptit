/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SapXepBangTinhTienDien;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> al = new ArrayList<>();
        while(t-->0){
            al.add(new KhachHang(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2){
                if(o1.getTong() - o2.getTong() < 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(KhachHang x : al){
            System.out.println(x);
        }
    }
}
//3
//KD
//400
//555
//NN
//58
//400
//CN
//150
//700
