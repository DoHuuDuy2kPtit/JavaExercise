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

public class Bai17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> vector = new ArrayList<Integer>();
            int a[] = new int[n+1];
        
            for (int i = 0; i < n; i++ ) {
                a[i] = sc.nextInt();
            }
            
            for(int i = 0; i < n-1; i++){
                int state = 1;
                for (int j = i+1; j < n; j++) {
                    if(a[j] >= a[i]){
                        state = 0;
                        break;
                    }
                }
                if(state == 1) vector.add(a[i]);
            }
            vector.add(a[n-1]);
            Collections.sort(vector, Comparator.comparing(o ->(int)o).reversed());
            for(Integer i : vector){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}

