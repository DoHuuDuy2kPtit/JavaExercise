/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class;

/**
 *
 * @author admin
 */
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentID = sc.next();
        sc.nextLine();
        String name = sc.nextLine();
        String nameClass = sc.next();
        String grade = sc.next();
        
        Student st = new Student(studentID,name,nameClass,grade);
        
        System.out.println(st.toString());
    }
}
