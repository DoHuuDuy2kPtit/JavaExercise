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
public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        
        int n = sc.nextInt();
        
        int a[][] = new int[m+1][n+1];
        
        int b[][] = new int[n+1][m+1];
        
        for(int i = 1; i <= m; i++){
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
                b[j][i] = a[i][j];
            }
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
