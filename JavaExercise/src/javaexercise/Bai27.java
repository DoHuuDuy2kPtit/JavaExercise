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

public class Bai27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String x = sc.nextLine();

        while (t-- > 0) {
            String n = sc.nextLine();
            System.out.println(chuanHoa(n));
        }
    }

    public static String chuanHoa(String n) {
        n = n.trim();
        n = n.replaceAll("\\s+", " ");

        String temp[] = n.split(" ");

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
