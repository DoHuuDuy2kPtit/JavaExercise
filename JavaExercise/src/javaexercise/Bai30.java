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

public class Bai30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String a = sc.nextLine();

            String b = sc.nextLine();

            if (isSmaller(a, b)) {
                System.out.println(subtractTwoString(a, b));
            } else {
                System.out.println(subtractTwoString(b, a));
            }
        }
    }

    public static boolean isSmaller(String str1, String str2) {
        int n1 = str1.length(), n2 = str2.length();
        if (n1 < n2) {
            return true;
        }
        if (n2 < n1) {
            return false;
        }

        for (int i = 0; i < n1; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return true;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return false;
            }
        }

        return false;
    }

    public static String subtractTwoString(String a, String b) {
        StringBuilder s1 = new StringBuilder(a);
        if (a.length() != b.length()) {
            for (int i = 0; i < b.length() - a.length(); i++) {
                s1.insert(0, '0');
            }
            a = s1.toString(); 
        }
        int temp = 0;
        String res = "";
        for (int i = b.length() - 1; i >= 0; i--) {
            int sub = ((int) (b.charAt(i) - '0')
                    - (int) (a.charAt(i) - '0') - temp);
            if(sub < 0) {
                sub += 10;
                temp = 1;
            } else temp = 0;
            res += (char)(sub + '0');
        }
        return new StringBuilder(res).reverse().toString();
    }
}
