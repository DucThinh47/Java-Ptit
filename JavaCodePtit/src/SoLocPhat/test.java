/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoLocPhat;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(5);
        q.add(6);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.poll();
        }
    }
}
