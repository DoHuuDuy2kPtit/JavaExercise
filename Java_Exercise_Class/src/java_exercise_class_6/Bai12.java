/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_6;

/**
 *
 * @author admin
 */
import java.util.*;
public class Bai12 {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do{
            System.out.println("===================MENU===================");
            System.out.println("1.Tinh tong va hieu cua hai ma tran");
            System.out.println("2.Tinh tich hai ma tran");
            System.out.println("3.Tim chuyen vi cua ma tran");
            System.out.println("4.Ket thuc chuong trinh");
            
            int choose = sc.nextInt();
            if(choose == 4) break;
            switch(choose){
                case 1:
                    findSumAndSub();
                    break;
                case 2:
                    findMultiply();
                    break;
                case 3:
                    findTranspose();
                    break;
                default:
                    System.out.println("Moi nhap lai");
                    break;
            }
            
        } while(true);
    }
    
    
    public static void findSumAndSub(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Matrix mtr1 = new Matrix(n,m);
        mtr1.input();
        
        int h = sc.nextInt();
        int k = sc.nextInt();
        
        Matrix mtr2 = new Matrix(h,k);
        mtr2.input();
        
        Matrix sum = mtr1.add(mtr2);
        sum.print();
        
        Matrix sub = mtr1.sub(mtr2);
        sub.print();
    }
    
    public static void findMultiply(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Matrix mtr1 = new Matrix(n,m);
        mtr1.input();
        
        int h = sc.nextInt();
        int k = sc.nextInt();
        
        Matrix mtr2 = new Matrix(h,k);
        mtr2.input();
        
        Matrix mult = mtr1.mul(mtr2);
        mult.print();
    }
    
    public static void findTranspose(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Matrix mtr1 = new Matrix(n,m);
        mtr1.input();
        
        Matrix mtr2 = mtr1.transpose();
        mtr2.print();
    }
}
