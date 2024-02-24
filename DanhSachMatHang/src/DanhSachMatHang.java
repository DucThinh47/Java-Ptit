/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> al = new ArrayList<>();
        while(t-->0){
            al.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
            sc.nextLine();
        }
        Collections.sort(al, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if(o1.getLoiNhuan() == o2.getLoiNhuan()){
                    return o1.getMa().compareTo(o2.getMa());
                }else{
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                }
            } 
        });
        for(MatHang x : al){
            System.out.println(x);
        }
    }
}

//2
//Ao phong tre em
//Cai
//25000
//41000
//Ao khoac nam
//Cai
//240000
//515000
