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
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> al = new ArrayList<>();
        while(t-->0){
            al.add(new MatHang(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
            sc.nextLine();
        }
        Collections.sort(al, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return (int)(o2.getLoiNhuan() - o1.getLoiNhuan());
            }
        });
        for(MatHang x : al){
            x.out();
            System.out.println();
        }
    }
}
