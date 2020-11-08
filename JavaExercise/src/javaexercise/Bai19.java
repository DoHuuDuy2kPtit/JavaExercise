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

public class Bai19 {
    
    public static int getPairsCount(int n, long k,long a[]){
        HashMap<Long,Long> hm = new HashMap<>();
        long zero = 0;
        for(int i = 0; i < n; i++){
            if(!hm.containsKey(a[i])) hm.put(a[i], zero);
            hm.put(a[i], hm.get(a[i])+1);
        }
        
        int count = 0;
        
        for(int i = 0; i< n; i++){
            if(hm.get(k-a[i]) != null){
                count+= hm.get(k-a[i]);
            }
            if(k - a[i] == a[i]) count--;
        }
        
        return count/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextInt();

            long a[] = new long[n+1];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(getPairsCount(n,k,a));
        }
    }
}
