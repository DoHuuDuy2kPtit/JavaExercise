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
public class Bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while(t-- > 0) {
            String s = sc.nextLine();
            
            System.out.println(chuanHoa(s));
        }
    }
    
    public static String chuanHoa(String s){
        s = s.trim();
        
        s = s.replaceAll("\\s+", " ");
        
        String temp[] = s.split(" ");
        String res = "";
        for(int i = 1; i < temp.length; i++){
            res += String.valueOf(temp[i].charAt(0)).toUpperCase();
            res += temp[i].substring(1).toLowerCase();
            if(i != temp.length - 1) res += " ";
            else res+=", ";
        }
        res += temp[0].toUpperCase();
        return res;
    }
}
