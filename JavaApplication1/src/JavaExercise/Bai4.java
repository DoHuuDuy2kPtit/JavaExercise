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
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int result = 0;
        
        if(n%2==0) {
            result = (n+2)*n/4; 
        }
        else result = (n+1)*(n+1)/4;
        
        System.out.println(result);
    }
}
