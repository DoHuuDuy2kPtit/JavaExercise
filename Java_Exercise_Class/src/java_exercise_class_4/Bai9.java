/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_4;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StackOfChars stk = new StackOfChars(n);
        int b = sc.nextInt();

        while (n != 0) {
            int mod = n % b;
            if (0 <= mod && mod <= 9) {
                stk.push((char) (mod+'0'));
            } else {
                char c = (char) ((mod - 10) + 'A');
                stk.push(c);
            }
            n = n / b;
        }

        while (!stk.isEmpty()) {
            System.out.print(stk.pop());
        }
        System.out.println("");
    }
}
