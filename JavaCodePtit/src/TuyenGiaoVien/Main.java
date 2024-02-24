/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TuyenGiaoVien;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> al = new ArrayList<>();
        while(t-->0){
            al.add(new GiaoVien(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<GiaoVien>(){
            @Override
            public int compare(GiaoVien o1, GiaoVien o2){
                if(o1.getTongDiem() == o2.getTongDiem()){
                    return o1.getMaGv().compareTo(o2.getMaGv());
                }else{
                    if(o1.getTongDiem() - o2.getTongDiem() < 0)
                        return 1;
                }
                return -1;
            }
        });
        for(GiaoVien x : al){
            System.out.println(x);
        }
    }
}
//3
//Le Van Binh
//A1
//7.0
//3.0
//Tran Van Toan
//B3
//4.0
//7.0
//Hoang Thi Tam
//C2
//7.0
//6.0
