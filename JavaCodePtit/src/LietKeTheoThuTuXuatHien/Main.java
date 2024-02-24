/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LietKeTheoThuTuXuatHien;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> al = (ArrayList<String>)ois.readObject();
        Set<String> se = new TreeSet<>();
        for(String x : al){
            String []tmp = x.trim().toLowerCase().split("\\s++");
            se.addAll(Arrays.asList(tmp));
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            String s = sc.next().toLowerCase();
            if(se.contains(s)){
                System.out.println(s);
                se.remove(s);
            }
        }
        ois.close();
    }
}