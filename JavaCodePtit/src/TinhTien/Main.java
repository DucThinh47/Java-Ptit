/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TinhTien;

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
        ArrayList<MatHang> al = new ArrayList<>();
        while(t-->0){
            al.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2){
                if(o1.getThanhTien() - o2.getThanhTien() < 0){
                    return 1;
                }
                return -1;
            }
        });
        for(MatHang x : al){
            System.out.println(x);
        }
    }
}
//3
//ML01
//May lanh SANYO
//12
//4000000
//2400000
//ML02
//May lanh HITACHI
//4
//2550000000
//0
//ML03
//May lanh NATIONAL
//5
//3000000
//150000
