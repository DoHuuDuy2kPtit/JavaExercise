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
public class Bai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[1001];

        for (int i = 0; i <= 1000; i++) {
            a[i] = 0;
        }

        int b[] = new int[1001];

        for (int i = 0; i < n; i++) {
            Random rd = new Random();
            b[i] = rd.nextInt(899)+100;
            a[b[i]]++;
        }
        
        for(int i = 0; i < n; i++){
            System.out.println(b[i] + " " + a[b[i]]);
        }
    }
}
