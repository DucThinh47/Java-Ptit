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
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<ThiSinh> al = new ArrayList<>();
        while(t-->0){
            al.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2){
                if(o1.getTongDiemCoUuTien() == o2.getTongDiemCoUuTien()){
                    if(o1.getTongDiemKoUuTien() - o2.getTongDiemKoUuTien() < 0){
                        return 1;
                    }else{
                        return -1;
                    }
                }else{
                    if(o1.getTongDiemCoUuTien() - o2.getTongDiemCoUuTien() < 0){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        });
        for(ThiSinh x : al){
            System.out.println(x);
        }
    }
}
