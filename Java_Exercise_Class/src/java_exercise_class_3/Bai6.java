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

public class Bai6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StackOfIntegers stk = new StackOfIntegers(n);

        while (n != 0) {
            stk.push(n % 2);
            n = n / 2;
        }
        while (!stk.isEmpty()) {
            System.out.print(stk.pop());
        }
        System.out.println("");
    }
}
