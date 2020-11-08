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

public class Bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0){
            String s = sc.next();
            
            System.out.println(solve(s));
        }
    }
    
    public static String solve(String n){
        int sum = 0;
        String res = "";
        for(int i = 0; i < n.length(); i++){
            if(isNum(n.charAt(i))){
                sum+= (n.charAt(i) - '0');
            }
            else res += n.charAt(i);
        }
        char tempArray[] = res.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray) + "" + sum;
    }
    
    public static boolean isNum(char x){
       if((x-'0')>= 0 && (x-'0')<= 9) return true;
       else return false;
    }
}
