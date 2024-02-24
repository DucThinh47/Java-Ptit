/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
public class Online{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private String ten;
    private Date start, end;
    private long online;
    
    public Online(String ten, String start, String end) throws ParseException{
        this.ten = ten;
        this.start = sdf.parse(start);
        this.end = sdf.parse(end);
        this.online = ChronoUnit.MINUTES.between(this.start.toInstant(), this.end.toInstant());
    }
    
    public String getTen(){
        return this.ten;
    }
    
    public long getOnline(){
        return this.online;
    }
    
    @Override
    public String toString(){
        return this.ten + " " + this.online;
    }
}