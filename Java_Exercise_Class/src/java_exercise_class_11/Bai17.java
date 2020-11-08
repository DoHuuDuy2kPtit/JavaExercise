/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_11;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Bai17 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Sach> listBooks = new ArrayList<>();

        File in = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_11\\SACH.INP");
        Scanner sc = new Scanner(in);
        while (sc.hasNextLine()) {
            int maSach = sc.nextInt();
            sc.nextLine();
            String tenSach = sc.nextLine();
            String chuyenNganh = sc.nextLine();
            double gia = sc.nextDouble();
            try {
                Sach book = new Sach(maSach, tenSach, chuyenNganh, gia);
                listBooks.add(book);
            } catch (SachException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
        listBooks.forEach((book) -> {
            System.out.println(book.toString());
        });
        Sach.printListBooks(listBooks);
        Sach.printListMajor(listBooks);
    }
}
