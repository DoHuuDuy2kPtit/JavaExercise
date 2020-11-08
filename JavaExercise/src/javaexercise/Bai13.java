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

public class Bai13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            String x = sc.nextLine();
            String b = sc.nextLine();
            
            long reduceNum = reduceB(a,b);
            System.out.println(gcd(reduceNum,a));
        }
    }

    public static long reduceB(long a, String b) {
        long result = 0;
        for (int i = 0; i < b.length(); i++) {
            result = (result * 10 + b.charAt(i) - '0') % a;
        }
        return result;
    }

    public static long gcd(long reduceNum, long b) {
        return b == 0 ? reduceNum : gcd(b, reduceNum % b);
    }
}
