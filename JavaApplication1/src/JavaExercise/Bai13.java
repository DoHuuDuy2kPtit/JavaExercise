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
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float c = sc.nextFloat();
        
        float n = ((1/c)-1)/2;
        
        float sum = 0;
        
        for(int i = 0; i <= (int)n;i++){
            sum += Math.pow(-1,i)*1/(2*i+1);
        }
        
        System.out.println(4*sum);
    }
}
