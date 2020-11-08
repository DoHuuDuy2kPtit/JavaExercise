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

public class Bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            long n = sc.nextLong();
           
            System.out.println(largestPrimeFactor(n));
        }
    }
    
    public static long largestPrimeFactor(long n){
        long maxPrime = -1;
        
        for (int i = 2; i <= Math.sqrt(n); i += 1) { 
            while (n % i == 0) { 
                maxPrime = i; 
                n = n / i; 
            } 
        } 
        if(n > 2) maxPrime = n;
        return maxPrime;
    }
}
