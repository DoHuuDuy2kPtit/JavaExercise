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
public class Bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        String temp[] = s.split(" ");
        
        int max_length = 0;
        int pos = 0;
        
        int l = 0;
        String res = "";
        
        for(int i = 0; i < temp.length; i++){
            if(temp[i].length() > max_length){
                max_length = temp[i].length();
                res = temp[i];
                pos = l+i+1;
            }
            l+=temp[i].length();
        }
        
        System.out.println("Từ dài nhất là " + res + " ở vị trí " + pos);
    }
}
