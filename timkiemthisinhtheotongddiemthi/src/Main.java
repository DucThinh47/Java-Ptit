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
        while (t-- > 0) {
            al.add(new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        double  a = Double.parseDouble(sc.nextLine());
        for(ThiSinh x : al){
            if(x.getUuTien() != 0){
                System.out.println("khong co");
                break;
            }
            if((x.getUuTien() == 0) && (x.getDiemTong() >- a)){
                System.out.println(x);
            }
        }
    }
}