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
import java.math.BigInteger;
import java.util.*;

public class Bai31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            BigInteger num1 = new BigInteger(a, 10);
            BigInteger num2 = new BigInteger(b, 10);
            BigInteger subtract = num1.subtract(num2).abs();
            subtract=num1.subtract(num2).abs();
            int len1=subtract.toString().length(); 
            int len2=num1.max(num2).toString().length();
            for(int i=1;i<=len2-len1;i++) System.out.print(0);
            System.out.println(subtract);
        }
    }
}
