/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GameThu> al = new ArrayList<>();
        while(t-->0){
            al.add(new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(),sc.nextLine()));
        }
        Collections.sort(al,new Comparator<GameThu>(){
            @Override
            public int compare(GameThu o1, GameThu o2){
                if(o1.getGio() == o2.getGio()){
                    return (int)(o2.getPhut() - o1.getPhut());
                }else{
                    return (int)(o2.getGio() - o1.getGio());
                }
            }
        });
        for(GameThu x : al){
            System.out.println(x);
        }
    }
}
//3
//01T
//Nguyen Van An
//09:00
//10:30
//06T
//Hoang Van Nam
//15:30
//18:00
//02I
//Tran Hoa Binh
//09:05
//10:00
