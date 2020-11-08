/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExercise;

import java.util.Scanner;

/**
 *
 * Cody by Duy :v
 */
public class Bai25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int n = sc.nextInt();

        int k = sc.nextInt();

        int a[][] = new int[m + 1][n + 1];

        int b[][] = new int[n + 1][k + 1];
        
        int res[][] = new int[m+1][k+1];
        
        for(int i = 0; i< m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                b[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < k; j++){
               res[i][j] = 0;
               for(int t = 0; t < n; t++){
                   res[i][j] += (a[i][t] * b[t][j]);
               }
            }
        }
        
        for(int i = 0; i <m; i++){
            for (int j = 0; j < k; j++) {
                System.out.print(res[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
}
