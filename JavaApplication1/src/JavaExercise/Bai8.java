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
public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.next();

        System.out.println(sumDigit(s));
    }

    public static int sumDigit(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += (s.charAt(i) - '0');
        }
        return res;
    }
}
