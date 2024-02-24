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
        ArrayList<SinhVien> al = new ArrayList<>();
        while(t-->0){
            al.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if(o1.getGpa() - o2.getGpa() < 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(SinhVien x : al){
            System.out.println(x);
        }
    }
}

//2
//ngUYen Van NaM
//D20DCCN01-B
//2/12/1994
//2.17
//Nguyen QuanG hAi
//D20DCCN02-B
//1/9/1994
//3.0
