/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_4;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(infixToPostfix(s));
    }

    public static int precedence(char x) {
        switch (x) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                break;
        }
        return -1;
    }
    
    public static String infixToPostfix(String s){
        StackOfChars stk = new StackOfChars();
        
        String res = "";
        
        for(int i = 0; i < s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                res += s.charAt(i);
            }
            else if(s.charAt(i) == '(') stk.push(s.charAt(i));
            
            else if(s.charAt(i) == ')') {
                while(!stk.isEmpty() && stk.peak() != '('){
                    char c = stk.peak();
                    res+=c;
                    stk.pop();
                }
                stk.pop();
            }
            else {
                while(!stk.isEmpty() && precedence(s.charAt(i)) <= precedence(stk.peak())){
                    char c = stk.peak();
                    res += c;
                    stk.pop();
                }
                stk.push(s.charAt(i));
            }   
        }
        while(!stk.isEmpty()){
            char c = stk.peak();
            if(c != '(') res+=c;
            stk.pop();
        }
        return res;
    }
}
