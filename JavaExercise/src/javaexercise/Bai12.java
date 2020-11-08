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

public class Bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            long count = 0;
            for (int i = 1; i <= Math.sqrt(n); i += 1) {
                if (n % i == 0) {
                    if(i%2==0) count++;
                    if (i!=n/i) {
                        if((n/i)%2 == 0)
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
