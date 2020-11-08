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

public class Bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int test = 1;

        while (t > 0) {
            int n = sc.nextInt();
            int count[] = new int[10001];
            boolean chuaxet[] = new boolean[10001];
            int a[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                chuaxet[a[i]] = true;
            }
            for (int i = 0; i < n; i++) {
                count[a[i]]++;
            }
            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++) {
                if (chuaxet[a[i]]) {
                    System.out.println(a[i] + " xuat hien " + count[a[i]] + " lan ");
                    chuaxet[a[i]] = false;
                }
            }
            test++;
            t--;
        }
    }
}
