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

public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            long a[] = new long[n + 1];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            if(checkDX(a,n)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }

    public static boolean checkDX(long a[],int n) {
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (a[l] != a[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
