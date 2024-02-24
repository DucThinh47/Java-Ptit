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
        int t = Integer.parseInt(sc.nextLine());
        Map<String, HocPhan> mp = new HashMap<>();
        ArrayList<HocPhan> al = new ArrayList<>();
        while(t-->0){
            HocPhan a = new HocPhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            al.add(a);
            mp.put(a.getMaMon(), a);
        }
        Collections.sort(al, new Comparator<HocPhan>(){
            @Override
            public int compare(HocPhan o1, HocPhan o2){
                return Integer.parseInt(o1.getNhomLop()) - Integer.parseInt(o2.getNhomLop());
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.next();
            System.out.println("Danh sach nhom lop mon " + mp.get(s).getTenMon() + ":");
            for(HocPhan x : al){
                if(x.getMaMon().equals(s)){
                    System.out.println(x);
                }
            }
        }
    }
}
//4
//THCS2D20
//Tin hoc co so 2 - D20
//01
//Nguyen Binh An
//CPPD20
//Ngon ngu lap trinh C++ - D20
//01
//Le Van Cong
//THCS2D20
//Tin hoc co so 2 - D20
//02
//Nguyen Trung Binh
//LTHDTD19
//Lap trinh huong doi tuong - D19
//01
//Nguyen Binh An
//1
//THCS2D20
