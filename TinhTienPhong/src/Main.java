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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Main{
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> al = new ArrayList<>();
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        while(t-->0){
            al.add(new KhachHang(sc.nextLine(), sc.nextLine(), dfm.parse(sc.nextLine()), dfm.parse(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<KhachHang>(){
           @Override
           public int compare(KhachHang o1, KhachHang o2){
               return o2.getTongTien() - o1.getTongTien();
           }
        });
        for(KhachHang x : al){
            System.out.println(x);
        }
    }
}