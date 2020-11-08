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
public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a[] = new int[1000];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int count = 1;
        int index = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(a[i+1] >= a[i]){
                count++;
                if(count > max){
                    max = count;
                    index = i+2 - max;
                }
            } else {
                count = 1;
            }
        }
        
        System.out.println(index + " " + max);
        
    }
}
