/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.temporal.ChronoUnit;

public class GameThu{
    
    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
    
    private String ma,ten;
    private Date time_in , time_out;
    private long gio, phut;
    
    public GameThu(String ma, String ten, String time_in, String time_out)throws ParseException{
        this.ma = ma;
        this.ten = ten;
        this.time_in = sdf.parse(time_in);
        this.time_out = sdf.parse(time_out);
        this.gio = ChronoUnit.HOURS.between(this.time_in.toInstant(), this.time_out.toInstant());
        this.phut = ChronoUnit.MINUTES.between(this.time_in.toInstant(), this.time_out.toInstant()) - this.gio * 60;
    }
    
    public long getGio(){
        return this.gio;

    }
    
    public long getPhut(){
        return this.phut;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %d gio %d phut", this.ma,this.ten,this.gio, this.phut);
    }
}