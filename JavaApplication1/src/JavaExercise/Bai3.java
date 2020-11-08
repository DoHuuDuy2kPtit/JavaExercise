/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExercise;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        Random rd = new Random();
        int randomNum = rd.nextInt(91)+10;
        int count = 0;
        do{
            System.out.println(randomNum);
            randomNum = rd.nextInt(91)+10;
            count++;
        } while(randomNum != num);
        System.out.println("Tổng số lần là " + count);
    }
}
