/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoNguyenToLonNhatTrongFile;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
import java.io.*;
public class Main{
    
    public static int[] prime = new int[1000001];
    
    static void sang(){
        Arrays.fill(prime, 1);
        prime[0] = 0;
        prime[1] = 0;
        for(int i=2; i<1001; i++){
            if(prime[i] == 1){
                for(int j=i*i; j<1000001; j+=i){
                    prime[j] = 0;
                }
            }
        }
    }
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        sang();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> al = (ArrayList<Integer>)ois.readObject();
        int[] cnt = new int[1000001];
        for(Integer x : al){
            cnt[x] += prime[x];
        }
        int dem = 0;
        for(int i=1000000; i>=2; i--){
            if(cnt[i] != 0){
                System.out.print(i + " " + cnt[i]);
                System.out.println(" ");
                ++dem;
            }
            
            if(dem == 10)
                break;
        }
        ois.close();
    }
}