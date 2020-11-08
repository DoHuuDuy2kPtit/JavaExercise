/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExercise;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = new String(); 
        s = sc.next();
        
        System.out.println(check(s));
        
    }
    
    private static boolean check(String s){
        int l = 0;
        int r = s.length()-1;
        
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        
        return true;
    }
}
