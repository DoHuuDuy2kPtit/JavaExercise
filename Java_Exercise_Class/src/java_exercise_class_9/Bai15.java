/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_9;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;

public class Bai15 {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<SinhVien> listSV = new ArrayList<>();
            File myFile = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_9\\SV.INP");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                String temp[] = s.split(" ");
                int maSV = Integer.parseInt(temp[0]);
                String name = "";
                for (int i = 1; i < temp.length - 2; i++) {
                    name += temp[i] + " ";
                }
                String lop = temp[temp.length - 2];
                double dtb = Double.parseDouble(temp[temp.length - 1]);
                try {
                    SinhVien sv = new SinhVien(maSV,name,lop,dtb);
                    listSV.add(sv);
                } catch (SinhVienException e) {
                    System.out.println(e.getMessage());
                }
            }
            sc.close(); 
        for(SinhVien sv: listSV){
            System.out.println(sv.toString());
        }
        SinhVien.printListClass(listSV);
        SinhVien.printRankSV(listSV);
    }
}
