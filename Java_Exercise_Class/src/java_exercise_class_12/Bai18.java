/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_12;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Bai18 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<MonHoc> listSubject = new ArrayList<>();

        File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_12\\MH.INP");
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
            int maMon = in.nextInt();
            in.nextLine();
            String tenMon = in.nextLine();
            String nhomMon = in.nextLine();
            int soTinChi = in.nextInt();
            in.nextLine();
            try {
                MonHoc subject = new MonHoc(maMon, tenMon, nhomMon, soTinChi);
                listSubject.add(subject);
            } catch (MonHocException e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
        for (MonHoc sub : listSubject) {
            System.out.println(sub.toString());
        }
        MonHoc.printListBooks(listSubject);
        MonHoc.printListMajor(listSubject);
    }
}
