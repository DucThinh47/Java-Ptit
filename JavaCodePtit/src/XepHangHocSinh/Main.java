/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package XepHangHocSinh;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int n = t;
        ArrayList<HocSinh> arr = new ArrayList<>();
        while(t-->0){
            arr.add(new HocSinh(sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        ArrayList<HocSinh> tmp = (ArrayList<HocSinh>)arr.clone();
        Collections.sort(tmp);
        tmp.get(0).setRank(1);
        for(int i=1; i<n; i++){
            if(tmp.get(i).getDiem() == tmp.get(i-1).getDiem()){
                tmp.get(i).setRank(tmp.get(i-1).getRank());
            }else{
                tmp.get(i).setRank(i+1);
            }
        }
        for(HocSinh x : arr){
            System.out.println(x);
        }
    }
}
//3
//Tran Minh Hieu
//5.9
//Nguyen Bao Trung
//8.6
//Le Hong Ha
//9.2
