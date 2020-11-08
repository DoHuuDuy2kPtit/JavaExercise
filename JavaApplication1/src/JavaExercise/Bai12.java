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
public class Bai12 {

    public static void main(String[] args) {
        for(int i = 100000; i <= 999999; i++){
            if(check(i)==true) System.out.println(i);
        }
    }

    public static boolean check(int num) {
        int temp = num;
        int newNum = 0;

        while (num != 0) {
            int a = num % 10;
            num = num / 10;
            newNum = newNum*10 + a;
        }
        return temp == newNum;
    }
}
