/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DanhSachKhachHang;

/**
 *
 * @author Duc Thinh
 */
import java.text.ParseException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> al = new ArrayList<>();
        while(t-->0){
            KhachHang k = new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            al.add(k);
        }
        Collections.sort(al, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2){
                return o2.getDaysOfBirth() - o1.getDaysOfBirth();
            }
        });
        for(KhachHang x : al){
            System.out.println(x);
        }
    }
}
//2
// nGuyen VAN     nAm
//Nam
//2/2/1997
//Mo Lao-Ha Dong-Ha Noi
// TRan    vAn     biNh
//Nam
//4/11/1995
//Phung Khoang-Nam Tu Liem-Ha Noi