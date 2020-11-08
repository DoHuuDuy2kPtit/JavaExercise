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

public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            long m = sc.nextLong();

            System.out.print(m * n / gcd(m, n) + " " + gcd(m, n) + "\n");
        }
    }

    public static long gcd(long m,long n) {
        if (m == 0 || n == 0) {
            return m + n;
        }

        while (m != n) {
            if (m > n) {
                m -= n;
            } else {
                n -= m;
            }
        }
        return m;
    }
}
