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

public class Bai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n + 1];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            int sumLeft = 0;
            int test = 0;
            for (int i = 0; i < n-1; i++) {
                if(sumLeft == sum - sumLeft -a[i]){
                    test = 1;
                    System.out.println(i+1);
                }
                sumLeft += a[i];
            }
            if(test == 0) System.out.println(-1);
        }
    }
}
