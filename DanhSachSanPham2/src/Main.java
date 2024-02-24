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
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SanPham> al = new ArrayList<>();
        while(t-->0){
            al.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
            sc.nextLine();
        }
        Collections.sort(al, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if(o1.getGia() == o2.getGia()){
                    return o1.getMa().compareTo(o2.getMa());
                }else{
                    return o2.getGia() - o1.getGia();
                }
            }
        });
        for(SanPham x : al){
            System.out.println(x);
        }
    }
}
