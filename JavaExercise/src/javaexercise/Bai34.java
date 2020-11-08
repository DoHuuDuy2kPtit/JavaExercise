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

public class Bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String n = sc.next();
            System.out.println(check(n));
        }
    }
    
    public static int check(String n){
        int len = n.length();
        
        long oddDigSum = 0;
        long evenDigSum = 0;
        
        for(int i = 0; i < len; i++){
            if(i%2==0){
                oddDigSum += (n.charAt(i) - '0');
            } else {
                evenDigSum += (n.charAt(i) - '0');
            }
        }
        if((oddDigSum-evenDigSum)%11==0) return 1;
        else return 0;
    }
}
