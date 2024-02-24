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
        ArrayList<SinhVien> al = new ArrayList<>();
        while(t-->0){
            al.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-->0){
            String s = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + s.toUpperCase() + ":");
            for(SinhVien x : al){
                boolean tmp = false;
                if((s.compareTo("Ke toan") == 0) && (x.getNganh().compareTo("DCKT") == 0)){
                    tmp = true;
                }else if(s.compareTo("Cong nghe thonog tin") == 0 && x.getNganh().compareTo("DCCN") == 0 && x.getLop().charAt(0) != 'E'){
                    tmp = true;
                }else if(s.compareTo("An toan thong tin") == 0 && x.getNganh().compareTo("DCAT") == 0 && x.getLop().charAt(0) != 'E'){
                    tmp = true;
                }else if(s.compareTo("Vien thong") == 0 && x.getNganh().compareTo("DCVT") == 0){
                    tmp = true;
                }else if(s.compareTo("Dien tu") == 0 && x.getNganh().compareTo("DCDT") == 0){
                    tmp = true;
                }else{
                    tmp = false;
                }
                if(tmp == true){
                    System.out.println(x);
                }
            }
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//Ke toan