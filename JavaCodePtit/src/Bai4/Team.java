/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class Team implements Comparable<Team>{
    private String ten_truong, ten_doi, ma_team;
    public static int cnt = 0;
    
    public Team(){
        this.ma_team = String.format("team&02d", ++cnt);
    }
    
    public String getTenTruong(){
        return this.ten_truong;
    }
    
    public void setTenTruong(String s){
        this.ten_truong = s;
    }
    
    public void setTenDoi(String s){
        this.ten_doi = s;
    }
    
    public String getTenDoi(){
        return this.ten_doi;
    }
    
    @Override
    public int compareTo(Team o){
        if(this.ten_truong.compareTo(o.ten_truong) == 0)
            return this.ten_doi.compareTo(o.ten_doi);
        else
            return this.ten_truong.compareTo(o.ten_truong);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s", this.ma_team, this.ten_doi, this.ten_truong);
    }
}
