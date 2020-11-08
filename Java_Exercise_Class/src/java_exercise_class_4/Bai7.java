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
import java_exercise_class_3.StackOfIntegers;

public class Bai7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String infix = sc.nextLine();
        
        System.out.println(valueOfInfix(infix));
    }

    public static int precedence(char x) {
        switch (x) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                break;
        }
        return -1;
    }

    public static boolean isNumber(char x) {
        return ('0' <= x && x <= '9');
    }

    public static int valueOfInfix(String s) {
        StackOfChars stkOperator = new StackOfChars(s.length());
        StackOfIntegers stkOperand = new StackOfIntegers(s.length());

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stkOperator.push('(');
            }

            if (isNumber(s.charAt(i))) {
                int num = 0;
                while (i < s.length() && isNumber(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                System.out.println("Line 60"+num);
                stkOperand.push(num);
            }

            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                while (!stkOperator.isEmpty() && precedence(s.charAt(i)) <= precedence(stkOperator.peak())) {
                    int num1, num2;
                    num1 = stkOperand.peak();
                    System.out.println("Line 68" + num1);
                    stkOperand.pop();
                    num2 = stkOperand.peak();
                    System.out.println("Line 71" + num2);
                    stkOperand.pop();
                    switch (stkOperator.peak()) {
                        case '+':
                            stkOperand.push(num1 + num2);
                            break;
                        case '-':
                            stkOperand.push(num1 - num2);
                            break;
                        case '/':
                            stkOperand.push(num1 / num2);
                            break;
                        case '*':
                            stkOperand.push(num1 * num2);
                            break;
                    }
                    stkOperator.pop();
                }
            }

            if (s.charAt(i) == ')') {
                while (!stkOperator.isEmpty() && stkOperator.peak() != '(') {
                    int num1, num2;
                    num1 = stkOperand.peak();
                    System.out.println("Line 95"+num1);
                    stkOperand.pop();
                    num2 = stkOperand.peak();
                    System.out.println("Line 98"+num2);
                    stkOperand.pop();
                    switch (stkOperator.peak()) {
                        case '+':
                            stkOperand.push(num1 + num2);
                            break;
                        case '-':
                            stkOperand.push(num1 - num2);
                            break;
                        case '/':
                            stkOperand.push(num1 / num2);
                            break;
                        case '*':
                            stkOperand.push(num1 * num2);
                            break;
                    }
                    stkOperator.pop();
                }
                if (!stkOperator.isEmpty() && stkOperator.peak() == '(') {
                    stkOperator.pop();
                }
            }
        }
        while (!stkOperator.isEmpty()) {
            int num1, num2;
            num1 = stkOperand.peak();
            System.out.println(num1);
            stkOperand.pop();
            num2 = stkOperand.peak();
            System.out.println(num2);
            stkOperand.pop();
            switch (stkOperator.peak()) {
                case '+':
                    stkOperand.push(num1 + num2);
                    break;
                case '-':
                    stkOperand.push(num1 - num2);
                    break;
                case '/':
                    stkOperand.push(num1 / num2);
                    break;
                case '*':
                    stkOperand.push(num1 * num2);
                    break;
            }
            stkOperator.pop();
        }
        return stkOperand.peak();
    }
}
