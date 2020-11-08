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
public class Bai30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        
        System.out.println(chuanHoaXau(s));
    }

    private static String chuanHoaXau(String s) {
        s = s.trim();

        s = s.replaceAll("\\s+", " ");

        String temp[] = s.split(" ");

        String res = "";

        for (int i = 0; i < temp.length; i++) {
            res += String.valueOf(temp[i].charAt(0)).toUpperCase();
            res += temp[i].substring(1).toLowerCase();
            if (i != temp.length - 1) {
                res += " ";
            }
        }
        return res;
    }
}
