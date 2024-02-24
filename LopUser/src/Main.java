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
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<User> al = new ArrayList<>();
        while (n-- > 0) {
            User a = new User(sc.nextLine(), sc.nextLine());
            al.add(a);
        }
        int m = sc.nextInt();
        sc.nextLine();
        while (m-- > 0) {
            String u = sc.nextLine();
            String p = sc.nextLine();
            for (User x : al) {
                if (u.equals(x.getUsername()) && p.equals(x.getPassword())) {
                    System.out.println(x);
                }
            }

        }

    }
}
//4
//tendangnhap matkhau
//username password
//nguoidung m4tkh4un4yr4tb40m4t
//user2 password
//6
//tendangnhap matkhau
//username matkhau
//bfc34 contest
//username password
//tendangnhap matkhau
//user2 password

//a > b b > c a > c 
//a > b b < c a > c 
//a < b b < c a < c
//a < b b > c a > c
//a < b b > c a < c