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
public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- >0){
            String n = sc.next();
            int state = 0;
            if(tn(n)){
                for(int i = 0; i < n.length()/2; i++){
                    if((n.charAt(i) - '0')%2 != 0){
                        state = 1;
                       
                        break;
                    } 
                }
            } else state = 1;
            if(state == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static boolean tn(String n){
        StringBuilder b = new StringBuilder(n);
        String s1 = b.reverse().toString();
        return n.equals(s1);
    }
}
