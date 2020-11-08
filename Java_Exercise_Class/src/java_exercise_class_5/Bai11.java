/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_5;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        MyPoint p1 = new MyPoint(x1, y1);

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        MyPoint p2 = new MyPoint(x2, y2);

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        MyPoint p3 = new MyPoint(x3, y3);

        double p1p2 = MyPoint.distance(p1, p2);
        double p1p3 = MyPoint.distance(p1, p3);
        double p2p3 = MyPoint.distance(p2, p3);
        
        boolean isTriangle = true;
        
        if(p1p2 + p1p3 <= p2p3 || p1p2 + p2p3 <= p1p3 || p1p3 + p2p3 <= p1p2){
            isTriangle = false;
        }
        int special = 0;
        if(p1p2*p1p2 + p1p3*p1p3 == p2p3*p2p3 || p1p2*p1p2 + p2p3*p2p3 == p1p3*p1p3 || p1p3*p1p3 + p2p3*p2p3 == p1p2*p1p2){
            special = 1;
        }
        
        if(p1p2 == p1p3 || p1p2 == p2p3 || p2p3 == p1p3){
            special = 2;
        }
        
        if(special == 1 && special == 2){
            special = 3;
        }
        if(p1p2 == p1p3 && p1p3== p2p3){
            special = 4;
        }
        if(isTriangle == true){
            switch(special){
                case 1:
                    System.out.println("Tam giac vuong");
                    break;
                case 2:
                    System.out.println("Tam giac can");
                    break;
                case 3:
                    System.out.println("Tam giac vuong can");
                    break;
                case 4:
                    System.out.println("Tam giac deu");
                    break;
                default:
                    System.out.println("La tam giac");
                    break;
            }
        } else {
            System.out.println("Khong la tam giac");
        }
    }
}
