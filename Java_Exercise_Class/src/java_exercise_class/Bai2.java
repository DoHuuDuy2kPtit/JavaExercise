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

public class Bai2 {

    public static void main(String[] args) {
        ArrayList<Student> listStudents = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String studentID = sc.next();
            sc.nextLine();
            String name = sc.nextLine();
            String nameClass = sc.next();
            String grade = sc.next();
            Student st = new Student(studentID, name, nameClass, grade);
            listStudents.add(st);
        }

        Student.sortName(listStudents);

        Student.printListClass(listStudents);
    }

}
