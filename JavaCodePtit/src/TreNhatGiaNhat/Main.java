/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TreNhatGiaNhat;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args)throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<Tuoi> al = new ArrayList<>();
        while(t-->0){
            al.add(new Tuoi(sc.nextLine()));
        }
        Collections.sort(al, new Comparator<Tuoi>(){
            @Override
            public int compare(Tuoi o1, Tuoi o2){
                return (int)(o1.getTuoiTheoNgay() - o2.getTuoiTheoNgay());
            }
        });
        System.out.println(al.get(0));
        System.out.println(al.get(al.size() - 1));
    }
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990
