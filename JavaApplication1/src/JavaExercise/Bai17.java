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
public class Bai17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(C(j,i) + " ");
            }
            System.out.println("");
        }
    }

    private static int C(int k, int n) {
        if (k == 0 || k == n) {
            return 1;
        }
        if (k == 1) {
            return n;
        }
        return C(k - 1, n - 1) + C(k, n - 1);
    }
}
