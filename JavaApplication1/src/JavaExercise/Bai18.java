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
public class Bai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[51];

        for (int i = 0; i < n; i++) {
            Random rd = new Random();
            a[i] = rd.nextInt(899) + 100;
            System.out.print(a[i] + " ");
        }

        int l = 0;
        int r = n - 1;
        boolean state = true;
        while (l <= r) {
            if (a[l] != a[r]) {
                state = false;
                break;
            }
        }
        if(state == true) System.out.println("YES");
        else System.out.println("NO");
    }
}
