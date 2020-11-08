/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_3;

/**
 *
 * @author admin
 */
import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        StackOfIntegers stk = new StackOfIntegers(n/2);
        
        for(int i = 2; i <= n; i++){
            if(isPrime(i)) stk.push(i);
        }
        
        while(!stk.isEmpty()){
            System.out.print(stk.pop()+ " ");
        }
    }
    
    public static boolean isPrime(int a){
        for(int i = 2; i < a; i++){
            if(a%i==0) return false;
        }
        return true;
    }
}
