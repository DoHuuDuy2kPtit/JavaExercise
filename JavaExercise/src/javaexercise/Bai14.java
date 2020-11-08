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

public class Bai14 {

    static int MAX = 100000;

    static ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void sieve() {
        boolean[] isComposite = new boolean[MAX + 1];
        for (int i = 2; i * i <= MAX; i++) {
            if (isComposite[i] == false) {
                for (int j = 2; j * i <= MAX; j++) {
                    isComposite[i * j] = true;
                }
            }
        }

        for (int i = 2; i <= MAX; i++) {
            if (isComposite[i] == false) {
                primes.add(i);
            }
        }
    }
    public static long LCM(int n) {
        long lcm = 1;
        for (int i = 0; i < primes.size() && primes.get(i) <= n; i++) {
            int pp = primes.get(i);
            while (pp * primes.get(i) <= n) {
                pp = pp * primes.get(i);
            }
            lcm *= pp;
            lcm %= 1000000007;
        }
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            sieve();
            int N = sc.nextInt();
            System.out.println(LCM(N));
        }
    }
}
