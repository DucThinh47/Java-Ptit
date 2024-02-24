/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> al = new ArrayList<>();
        while(t-->0){
            al.add(new HocSinh(sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(al, new Comparator<HocSinh>(){
            @Override
            public int compare(HocSinh o1, HocSinh o2){
                if(o1.getDiemTb() == o2.getDiemTb()){
                    return o1.getMa().compareTo(o2.getMa());
                }else{
                    if(o1.getDiemTb() - o2.getDiemTb() < 0){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        });
        for(HocSinh x : al){
            System.out.println(x);
        }
    }
}

//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0
