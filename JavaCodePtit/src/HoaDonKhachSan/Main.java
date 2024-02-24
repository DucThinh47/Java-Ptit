/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDonKhachSan;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> al = new ArrayList<>();
        while(t-->0){
            al.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2){
                return o2.getThanhTien() - o1.getThanhTien();
            }
        });
        for(KhachHang x : al){
            System.out.println(x);
        }
    }
}
//3
//Huynh Van Thanh   
//103 
//05/06/2010   
//05/06/2010   
//15
//Le Duc Cong  
//106 
//08/03/2010   
//01/05/2010   
//220
//Tran Thi Bich Tuyen   
//207 
//10/04/2010   
//21/04/2010   
//96