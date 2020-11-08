/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_3;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StackOfIntegers stk = new StackOfIntegers(n);
        while (n % 2 == 0) {
            n = n / 2;
            stk.push(2);
        }
        int i = 3;
        while (n != 1) {
            if (n % i == 0) {
                n = n / i;
                stk.push(i);
            } else {
                i += 2;
            }
        }
        if (n != 1) {
            stk.push(n);
        }

        while (!stk.isEmpty()) {
            System.out.print(stk.pop() + " ");
        }
    }
}
