/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class SinhVien{
    private String msv, sdt, email;
    private String firstName, lastName, fullName;
    
    public SinhVien(String msv, String ten, String sdt, String email){
        this.msv = msv;
        this.fullName = ten;
        this.sdt = sdt;
        this.email = email;
        String[] arr = ten.split("\\s+");
        this.lastName = arr[arr.length - 1];
        this.firstName = ten.substring(0, this.fullName.length() - this.lastName.length());
    }
    
    public String getMsv(){
        return this.msv;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    @Override
    public String toString(){
        return this.msv + " " + this.fullName + " " + this.sdt + " " + this.email;
    }
}