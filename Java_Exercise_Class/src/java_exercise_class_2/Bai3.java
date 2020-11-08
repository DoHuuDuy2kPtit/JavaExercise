/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_2;

/**
 *
 * @author admin
 */
import java.util.*;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        sc.nextLine();
        String color = sc.next();
        
        Rectangle hcn = new Rectangle(width, height, color);
        
        System.out.println("Width is " + hcn.getWidth());
        System.out.println("Height is " + hcn.getHeight());
        System.out.println("Color is " + hcn.getColor());
        System.out.println("Area of rectangle is " + hcn.findArea());
        System.out.println("Perimeter of rectangle is " + hcn.findPerimeter());
    }
}
