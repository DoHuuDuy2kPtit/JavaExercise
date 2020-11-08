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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(gcd(a,b));
        System.out.println(a*b/gcd(a,b));
    }
    
    private static int gcd(int a, int b){
        if(a==0 || b == 0) return a+b;
        
        while(a!=b){
            if(a>b) a -=b;
            else b-=a;
        }
        return a;
    }
}
