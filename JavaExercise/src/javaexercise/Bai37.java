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

public class Bai37 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int L = 0;
        while(sc.hasNext()){
            String n = sc.next();
            if (tn(n)) {
                if (!hm.containsKey(n)) {
                    hm.put(n, 1);
                } else {
                    hm.replace(n, hm.get(n) + 1);
                }
                if (L < n.length()) {
                    L = n.length();
                }
            }
        }
        for (Map.Entry<String, Integer> e : hm.entrySet()) {
            if (e.getKey().length() == L) {
                System.out.println(e.getKey() + " " + e.getValue());
            }
        }
    }

    public static boolean tn(String n) {
        StringBuilder s1 = new StringBuilder(n);

        String temp = s1.reverse().toString();

        return temp.equals(n);
    }
}
