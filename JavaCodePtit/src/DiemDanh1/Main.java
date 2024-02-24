/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DiemDanh1;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
//        int tmp = t;
        Map<String, SinhVien> mp = new LinkedHashMap<>();
        ArrayList<DiemDanh> al = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            SinhVien s = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            mp.put(s.getMa(), s);
        }
        for(String id : mp.keySet()){
            System.out.println(id + " - " + mp.get(id));
        }
        System.out.println();
        for (int i = 0; i < t; i++) {
            DiemDanh d = new DiemDanh(sc.nextLine());
            al.add(d);
//            if (mp.containsKey(d.getMa())) {
//                al.get(i).setTen(mp.get(d.getMa()).getTen());
//                al.get(i).setLop(mp.get(d.getMa()).getLop());
//            }
        }
        for(int i=0; i<t; i++){
            if (mp.containsKey(al.get(i).getMa())) {
                al.get(i).setTen(mp.get(al.get(i).getMa()).getTen());
                al.get(i).setLop(mp.get(al.get(i).getMa()).getLop());
            }
        }
        for(DiemDanh x : al){
            System.out.println(x);
        }
    }
}
//3
//B19DCCN999
//Le Cong Minh
//D19CQAT02-B
//B19DCCN998
//Tran Truong Giang
//D19CQAT02-B
//B19DCCN997
//Nguyen Tuan Anh
//D19CQCN04-B
//B19DCCN998 xxxmxmmvmx
//B19DCCN997 xmxmxxxvxx
//B19DCCN999 xvxmxmmvvm
