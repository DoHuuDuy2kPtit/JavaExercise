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

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int test = 1;
        while (t > 0) {
            long n = sc.nextLong();

            long a[] = new long[100];
            int j = 0;
            for (long i = 2; i <= n; i++) {
                while (n % i == 0) {
                    a[j] = i;
                    j++;
                    n = n / i;
                }
            }
            Arrays.sort(a, 0, j);
            int count = 1;

            System.out.print("Test " + test + ": ");
            for (int i = 0; i < j; i++) {
                if (a[i] == a[i + 1]) {
                    count++;
                } else {
                    System.out.print(a[i] + "(" + count + ") ");
                    count = 1;
                }
            }
            System.out.println("");
            test++;
            t--;
        }
    }
}
