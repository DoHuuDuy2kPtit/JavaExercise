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

public class Bai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 2000000;
        int check[] = new int[max+5];
        check[1] = 1;
        for (int i = 2; i <= max; i++) {
            if (check[i] == 0) {
                check[i] = i;
                for (int j = 2 * i; j <= max; j += i) {
                    if(check[j] == 0) check[j] = i;
                }
            }
        }
        int t = sc.nextInt();
        long sum = 0;
        while (t-- > 0) {
            int n = sc.nextInt();
            while(n>1){
                sum+=check[n];
                n /= check[n];
            }
        }
        System.out.println(sum);
    }
}
