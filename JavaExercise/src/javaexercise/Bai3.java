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
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t>0){
            long n = sc.nextLong();
            long f1 = 1;
            long f2 = 1;
            long fn = 0;
            for(int i = 2; i < n; i++){
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
            }
            System.out.println(f2);
            t--;
        }
    }
}
