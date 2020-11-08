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

public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            String n = sc.next();
            
            int mod = A_mod_B(n,4);
            
            int ans = (1 + (int)Math.pow(2,mod) + (int)Math.pow(3,mod) +  (int)Math.pow(4, mod));
            
            System.out.println(ans%5);
        }
    }
    
    public static int A_mod_B(String n, int a){
        int len = n.length();
        
        int ans = 0;
        for(int i = 0; i < len; i++){
            ans = (ans*10 +(int)n.charAt(i) -'0') % a;
        }
        return ans%a;
    }
    
}
