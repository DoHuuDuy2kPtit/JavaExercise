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

public class Student {

    private final String studentID;
    private final String name;
    private final String nameClass;
    private final String grade;

    public Student(String studentID, String name, String nameClass, String grade) {
        this.studentID = studentID;
        this.name = name;
        this.nameClass = nameClass;
        this.grade = grade;
    }
    

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", nameClass=" + nameClass + ", grade=" + grade + '}';
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public String getGrade() {
        return grade;
    }

    public static void sortName(ArrayList<Student> listStudents) {
        Collections.sort(listStudents, (Student o1, Student o2) -> {
            String arr1[] = o1.getName().split(" ");
            String arr2[] = o2.getName().split(" ");
            return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
        });
    }

    public static void printListClass(ArrayList<Student> listStudents) {
        Map<String, ArrayList<Student>> listClass = new HashMap<>();
        
        listStudents.forEach((st) -> {
            if (listClass.containsKey(st.getNameClass())) {
                listClass.get(st.getNameClass()).add(st);
            } else {
                ArrayList<Student> list = new ArrayList<>();
                list.add(st);
                listClass.put(st.getNameClass(), list);
            }
        });
        
        for (Map.Entry<String, ArrayList<Student>> entry : listClass.entrySet()) {
            System.out.println(entry.getKey());
            for (Student value : entry.getValue()) {
                System.out.println(value.toString());
            }
        }
    }
}
