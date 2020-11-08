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

public class MatHang {

    private int maHang;
    private String ten;
    private String nhom;
    private double giaBan;

    public MatHang() {
    }

    public MatHang(int m, String t, String n, double gia) throws MatHangException {
        if (m < 1000 || m > 9999) {
            throw new MatHangException("Ma Hang khong hop le!!");
        }
        if (t.matches("")) {
            throw new MatHangException("Ten Hang khong hop le!!");
        }
        if (gia < 0) {
            throw new MatHangException("Gia ban khong duoc nho hon 0!!");
        }
        maHang = m;
        ten = t;
        nhom = n;
        giaBan = gia;
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTen() {
        return ten;
    }

    public String getNhom() {
        return nhom;
    }

    public double getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return maHang + " " + ten + " " + nhom + " " + giaBan;
    }

    private static void sortPrice(ArrayList<MatHang> listMH) {
        Collections.sort(listMH, (MatHang mh1, MatHang mh2) -> {
            double price1 = mh1.getGiaBan();
            double price2 = mh2.getGiaBan();
            return price1 > price2 ? -1 : 1;
        });
    }

    private static void sortName(ArrayList<MatHang> listMH) {
        Collections.sort(listMH, (MatHang mh1, MatHang mh2) -> {
            String name1 = mh1.getTen();
            String name2 = mh2.getTen();
            return name1.compareTo(name2);
        });
    }

    public static void printListMH(ArrayList<MatHang> listMH) {
        sortPrice(listMH);
        File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_10\\SX.OUT");
        try (PrintWriter out = new PrintWriter(file)) {
            listMH.forEach((mh) -> {
                out.println(mh.toString());
            });
        } catch (IOException e) {
            System.out.println("Khong ghi duoc file");
        }
    }

    public static void printListGroup(ArrayList<MatHang> listMH) {
        Map<String, ArrayList<MatHang>> listGroup = new HashMap<>();

        listMH.forEach((mh) -> {
            if (listGroup.containsKey(mh.getNhom())) {
                listGroup.get(mh.getNhom()).add(mh);
            } else {
                ArrayList<MatHang> items = new ArrayList<>();
                items.add(mh);
                listGroup.put(mh.getNhom(), items);
            }
        });

        try {
            File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_10\\NHOM.OUT");
            PrintWriter out = new PrintWriter(file);
            for (Map.Entry<String, ArrayList<MatHang>> mh : listGroup.entrySet()) {
                out.println(mh.getKey());
                sortName(mh.getValue());
                mh.getValue().forEach((item) -> {
                    out.println(item.toString());
                });
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Khong ghi duoc file");
        }
    }
}
