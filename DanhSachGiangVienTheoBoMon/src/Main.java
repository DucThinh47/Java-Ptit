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
        ArrayList<GiangVien> al = new ArrayList<>();
        while(t-->0){
            al.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            String[] arr = s.trim().split("\\s+");
            String res = "";
            for(String x : arr){
                res += Character.toUpperCase(x.charAt(0));
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + res + ":");
            for(GiangVien x : al){
                if(x.getVietTat().compareTo(res) == 0){
                    System.out.println(x);
                }
            }
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//Cong nghe phan mem
