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

public class Bai36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String n = sc.nextLine();

            String res = convertToEmail(n);
            if (!hm.containsKey(res)) {
                hm.put(res, 1);
                System.out.println(res + "@ptit.edu.vn");
            } else {
                hm.replace(res, hm.get(res) + 1);
                System.out.println(res + hm.get(res) + "@ptit.edu.vn");
            }
        }
    }

    public static String convertToEmail(String n) {
        n = n.trim();

        n = n.replaceAll("\\s+", " ");

        n = n.toLowerCase();

        String temp[] = n.split(" ");

        String res = temp[temp.length - 1];
        for (int i = 0; i < temp.length - 1; i++) {
            res += temp[i].charAt(0);
        }

        return res;
    }
}
