/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TenVietTat;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main {
    
    static String sortName(String s){
        String res = "";
        String[] arr = s.trim().split("\\s++");
        for(String x : arr){
            res += x.charAt(0);
        }
        return res;
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<DanhSach> al = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            al.add(new DanhSach(sc.nextLine()));
        }
        Collections.sort(al, new Comparator<DanhSach>(){
            @Override
            public int compare(DanhSach o1, DanhSach o2){
                if(o1.getFirstName().compareTo(o2.getFirstName()) == 0){
                    return o1.getLastName().compareTo(o2.getLastName());
                }else{
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
            }
        });
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            //s = p.d.*
            String tmp = "";
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) != '.'){
                    tmp += s.charAt(i);
                    //tmp = pd*
                }
            }
            boolean check;
            for(DanhSach x : al){
                check = true;
                String tmp1 = sortName(x.getFullName());
                if(tmp.length() != tmp1.length())
                    continue;
                //tmp = pd*    tmp1 = pdt
                for(int i=0; i<tmp.length(); i++){
                    if(tmp.charAt(i) != tmp1.charAt(i) && tmp.charAt(i) != '*'){
                        check = false;      
                        break;
                    }
                }
                if(check == true){
                    System.out.println(x);
                }
            }
        }
    }
}
