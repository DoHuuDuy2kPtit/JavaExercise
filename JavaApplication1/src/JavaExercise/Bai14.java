/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExercise;

/**
 *
 * @author admin
 */
public class Bai14 {

    public static void main(String[] args) {
        for (int i = 100000; i <= 999999; i++) {
            String num = Integer.toString(i);
            if (check(num)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean check(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        int sum = 0;
        for (int k = 0; k < s.length(); k++) {
            sum += (s.charAt(k) - '0');
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
