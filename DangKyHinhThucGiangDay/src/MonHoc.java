/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class MonHoc{
    private String ma,ten;
    private int tc;
    private String lt,th;
    
    public MonHoc(String ma, String ten, int tc, String lt, String th){
        this.ma = ma;
        this.ten = ten;
        this.tc = tc;
        this.lt = lt;
        this.th = th;
    }
    
    public String getTh(){
        return this.th;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    @Override
    public String toString(){
        return this.ma + " " + this.ten + " " + this.tc + " " + this.lt + " " + this.th;
    }
}