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
public class Bai22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        p++;
        int a[] = new int[100];

        int b[] = new int[100];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i <= m; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = p; i <= n; i++) {
            a[i + m] = a[i];
        }

        for (int i = 1; i <= m; i++) {
            a[p + i - 1] = b[i];
        }

        for (int i = 1; i <= n + m; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
