/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexercise;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- >0){
            String n = sc.next();
            
            System.out.println(xauDoiXung(n));
        }
    }
    
    public static String xauDoiXung(String n){
        int count = 0;
        for(int i = 0; i <n.length()/2;i++){
            if(n.charAt(i)==n.charAt(n.length()-1-i));
            else count++;
        }
        if(count == 1 || count == 0 && n.length()%2!=0) return "YES";
        else return "NO";
    }
}
