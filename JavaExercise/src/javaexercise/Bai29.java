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

public class Bai29 {

    static class Pair {

        char first;
        int second;

        Pair(char first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static int longestNull(String s) {
        ArrayList<Pair> arr = new ArrayList<>();

        arr.add(new Pair('@', -1));

        int maxlen = 0;

        for (int i = 0; i < s.length(); i++) {
            arr.add(new Pair(s.charAt(i), i));

            while (arr.size() >= 3 && arr.get(arr.size() - 3).first == '1' && arr.get(arr.size() - 2).first == '0' && arr.get(arr.size() - 1).first == '0') {
                arr.remove(arr.size() - 3);
                arr.remove(arr.size() - 2);
                arr.remove(arr.size() - 1);
            }
            
            int temp = arr.get(arr.size() - 1).second;
            
            maxlen = Math.max(maxlen, i-temp);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(longestNull(s));
        }
    }
}
