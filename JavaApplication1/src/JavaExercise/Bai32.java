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
public class Bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        String temp[] = s.split(" ");
        
        String res = "";
        
        res+= (temp[temp.length - 1] + " " + temp[0] + " ");
        
        for(int i = 1; i < temp.length - 1; i++){
            res += (temp[i] + " ");
        }
        
        System.out.println(res);
    }
}
