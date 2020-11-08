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
public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int f0 = 0;
        int f1 = 1;
        int f2 = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print(f0+ " ");
            f2 = f0 + f1;
            f0 = f1;
            f1 = f2;
        }
    }
}
