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
        ArrayList<BangDiem> al = new ArrayList<>();
        while(t-->0){
            al.add(new BangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2){
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        for(BangDiem x : al){
            System.out.println(x);
        }
    }
}
//3
//B20DCCN999
//Nguyen Van Nam
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van An
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Nguyen Van Binh
//D20CQCN01-B
//9.0
//5.0
//6.0
