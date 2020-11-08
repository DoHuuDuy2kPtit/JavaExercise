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
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();

        int k = 0;
        for (int i = 1; i <= height; i++) {
            int num = 1;
            for (int j = 1; j <= (2 * height - 1); j++) {
                if (height - k <= j && j <= height + k) {
                    System.out.print(num);
                    if (j >= height) {
                        num--;
                    } else {
                        num++;
                    }
                }
                else System.out.print(" ");
            }
            k++;
            System.out.println("");
        }
    }
}
