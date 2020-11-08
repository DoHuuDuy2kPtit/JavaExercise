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

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a[] = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        
        int step = 1;
        
        while(true){
            int count = 0;
            for(int i = 1; i < n; i++){
                if(a[i] < a[i-1]){
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    count++;
                }
            }
            if(count==0) break;
            else{
                System.out.print("Buoc " + step + ": ");
                step++;
                for(int j = 0; j < n; j++) System.out.print(a[j] + " ");
                System.out.println("");
            }
        }
    }
}
