/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExercise;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        int a[] = new int[501];
        
        for(int i = 0; i < n; i++){
            Random rd = new Random();
            a[i] = rd.nextInt(9000)+1000;
        }
        
        int min = 10000;
        int index = 0;
        for(int i = 0; i < n; i++){
            if(Math.abs(a[i]-x) < min && isPrime(a[i])) {
                min = Math.abs(a[i]-x);
                index = i;
            }
        }
        
        System.out.println(index + " " + a[index]);
    }
    
    private static boolean isPrime(int n){
        for(int i = 2; i < Math.sqrt(n); i++){
           if(n%i == 0) return false;
        }
        
        return true;
    }
}
