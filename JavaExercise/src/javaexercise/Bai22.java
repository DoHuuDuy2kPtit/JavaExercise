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

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int a[][] = new int[n+1][m+1];
            
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            
            
        }
    }
}
