/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class ThiSinh {
    private String maTeam, tenTeam, tenTruong;
    private String maThiSinh, tenThiSinh;
    private int n,m;
    public static int cnt = 0;
    
    public ThiSinh(Scanner sc){
        this.n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            this.tenTeam = sc.nextLine();
            this.tenTruong = sc.nextLine();
        }
        this.m = sc.nextInt();
        sc.nextLine();
        while(m-->0){
            this.maThiSinh = String.format("C%03d", ++cnt);
            this.tenThiSinh = sc.nextLine();
            this.maTeam = sc.nextLine();
        }
    }
    
    public String getTenThiSinh(){
        return this.tenThiSinh;
    }
    
    @Override
    public String toString(){
        return this.maThiSinh + " " + this.tenThiSinh + " " + this.tenTeam + " " + this.tenTruong;
    }
}
