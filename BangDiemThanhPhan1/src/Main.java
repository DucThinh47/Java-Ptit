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
        ArrayList<BangDiem> al = new ArrayList<>();
        while(t-->0){
            al.add(new BangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
//                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for(BangDiem x : al){
            
            System.out.println(x);
        }
    }   
}

//3
//B20DCCN999
//Nguyen Van An
//D20CQCN04-B
//10.0
//9.0
//8.0
//B20DCAT001
//Le Van Nam
//D20CQAT02-B
//6.0
//6.0
//4.0
//B20DCCN111
//Tran Hoa Binh
//D20CQCN04-B
//9.0
//5.0
//6.0
