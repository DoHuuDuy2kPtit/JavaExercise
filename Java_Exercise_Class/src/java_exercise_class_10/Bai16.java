/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_10;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Bai16 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<MatHang> listMH = new ArrayList<>();
        File in = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_10\\MH.INP");
        Scanner sc = new Scanner(in);
        while (sc.hasNextLine()) {
            int maHang = sc.nextInt();
            sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            double gia = sc.nextDouble();
            try {
                MatHang mh = new MatHang(maHang, ten, nhom, gia);
                listMH.add(mh);
            } catch (MatHangException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
        listMH.forEach((mh) -> {
            System.out.println(mh.toString());
        });
        MatHang.printListMH(listMH);
        MatHang.printListGroup(listMH);
    }
}
