/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n+1];

        for (int i = 0; i < n; i++) {
            Random rd = new Random();

            a[i] = rd.nextInt(899) + 100;

        }
        Arrays.sort(a);

        System.out.print(Arrays.toString(a));
    }
}
