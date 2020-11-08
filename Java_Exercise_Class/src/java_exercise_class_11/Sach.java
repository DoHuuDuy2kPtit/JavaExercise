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

public class Sach {

    private int maSach;
    private String tenSach;
    private String chuyenNganh;
    private double giaBan;

    public Sach() {
    }

    public Sach(int maSach, String tenSach, String chuyenNganh, double giaBan) throws SachException {
        if (maSach < 1000 || maSach > 9999) {
            throw new SachException("Ma Sach khong hop le");
        }
        if (tenSach.matches("")) {
            throw new SachException("Ten Sach khong duoc de trong");
        }
        if (giaBan < 0) {
            throw new SachException("Gia khong duoc nho hon 0");
        }
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.chuyenNganh = chuyenNganh;
        this.giaBan = giaBan;
    }

    public int getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public double getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return maSach + " " + tenSach + " " + chuyenNganh + " " + giaBan;
    }

    private static void sortPrice(ArrayList<Sach> listBooks) {
        Collections.sort(listBooks, (Sach book1, Sach book2) -> {
            double price1 = book1.getGiaBan();
            double price2 = book2.getGiaBan();
            return price1 > price2 ? -1 : 1;
        });
    }

    private static void sortName(ArrayList<Sach> listBooks) {
        Collections.sort(listBooks, (Sach book1, Sach book2) -> {
            String name1 = book1.getTenSach();
            String name2 = book2.getTenSach();
            return name1.compareTo(name2);
        });
    }

    public static void printListBooks(ArrayList<Sach> listBooks) {
        sortPrice(listBooks);
        File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_11\\SX.OUT");
        try (PrintWriter out = new PrintWriter(file)) {
            listBooks.forEach((book) -> {
                out.println(book.toString());
            });
        } catch (IOException e) {
            System.out.println("Khong ghi duoc file");
        }
    }

    public static void printListMajor(ArrayList<Sach> listBooks) {
        Map<String, ArrayList<Sach>> listMajor = new HashMap<>();

        listBooks.forEach((book) -> {
            if (listMajor.containsKey(book.getChuyenNganh())) {
                listMajor.get(book.chuyenNganh).add(book);
            } else {
                ArrayList<Sach> books = new ArrayList<>();
                books.add(book);
                listMajor.put(book.getChuyenNganh(), books);
            }
        });

        File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_11\\CN.OUT");
        try (PrintWriter out = new PrintWriter(file)) {
            for (Map.Entry<String, ArrayList<Sach>> entry : listMajor.entrySet()) {
                out.println(entry.getKey());
                sortName(entry.getValue());
                entry.getValue().forEach((book) -> {
                    out.println(book.toString());
                });
            }
        } catch (IOException e) {
            System.out.println("Khong ghi duoc file");
        }
    }
}
