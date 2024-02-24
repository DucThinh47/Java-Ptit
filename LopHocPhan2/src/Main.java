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
        ArrayList<LopHoc> al = new ArrayList<>();
        while(t-->0){
            al.add(new LopHoc(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<LopHoc>(){
            @Override
            public int compare(LopHoc o1, LopHoc o2){
                if(o1.getMa().equals(o2.getMa())){
                    return o1.getNhom() - o2.getNhom();
                }else{
                    return o1.getMa().compareTo(o2.getMa());
                }
            }
        });
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            System.out.println("Danh sach cho giang vien " + s + ":");
            for(LopHoc x : al){
                if(x.getGiangVien().equals(s)){
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
//Nguyen Binh An
