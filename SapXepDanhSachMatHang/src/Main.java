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
        ArrayList<MatHang> al = new ArrayList<>();
        while(t-->0){
            al.add(new MatHang(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(al, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2){
                if(o1.getLoiNhuan() - o2.getLoiNhuan() < 0){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        for(MatHang x : al){
            System.out.println(x);
        }
    }
}

//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27.5
//37

