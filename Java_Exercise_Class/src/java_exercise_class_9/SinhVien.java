/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_9;

import java.util.*;
import java.io.*;

/**
 *
 * @author admin
 */
public class SinhVien {

    private int maSV;
    private String ten;
    private String lop;
    private double dtb;

    public SinhVien() {
    }

    public SinhVien(int m, String t, String l, double d) throws SinhVienException {
        if (m < 1000 || m > 9999) {
            throw new SinhVienException("Ma SV ko hop le");
        }
        if (t.matches("")) {
            throw new SinhVienException("Ten ko hop le");
        }
        if (!l.matches("(M|D|C|L|T|B|E)[0-9][1-9]((CQ)|(TC)|(TX)|(DN))((AT)|(CN)|(DT))[0-9][0-9]\\-(B|N|K)")) {
            throw new SinhVienException("Lop khong hop le ");
        }
        if (d < 0 || d > 10) {
            throw new SinhVienException("Dtb khong hop le ");
        }
        maSV = m;
        ten = t;
        lop = l;
        dtb = d;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + lop + " " + dtb;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    private static void sortDiem(ArrayList<SinhVien> listSV) {
        Collections.sort(listSV, (SinhVien o1, SinhVien o2) -> {
            double dtb1 = o1.getDtb();
            double dtb2 = o2.getDtb();
            return dtb1 > dtb2 ? -1 : 1;
        });
    }

    private static void sortName(ArrayList<SinhVien> listSV) {
        Collections.sort(listSV, (SinhVien sv1, SinhVien sv2) -> {
            String name1[] = sv1.getTen().split(" ");
            String name2[] = sv2.getTen().split(" ");
            if (name1[name1.length - 1].compareTo(name2[name2.length - 1]) != 0) {
                return name1[name1.length - 1].compareTo(name2[name2.length - 1]);
            } else if (name1[0].compareTo(name2[0]) != 0) {
                return name1[0].compareTo(name2[0]);
            } else {
                return name1[1].compareTo(name2[1]);
            }
        });
    }

    public static void printListClass(ArrayList<SinhVien> listSV) {
        Map<String, ArrayList<SinhVien>> listClass = new HashMap<>();

        listSV.forEach((sv) -> {
            if (listClass.containsKey(sv.getLop())) {
                listClass.get(sv.getLop()).add(sv);
            } else {
                ArrayList<SinhVien> list = new ArrayList<>();
                list.add(sv);
                listClass.put(sv.getLop(), list);
            }
        });
        try {
            File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_9\\SX.OUT");
            PrintWriter out = new PrintWriter(file);
            for (Map.Entry<String, ArrayList<SinhVien>> entry : listClass.entrySet()) {
                sortDiem(entry.getValue());
                out.println(entry.getKey());
                for (SinhVien sv : entry.getValue()) {
                    out.println(sv.toString());
                }
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Ko tim thay file");
        }
    }

    public static void printRankSV(ArrayList<SinhVien> listSV) {
        Map<String, ArrayList<SinhVien>> listRank = new HashMap<>();
        ArrayList<SinhVien> listGioi = new ArrayList<>();
        listRank.put("Gioi", listGioi);
        ArrayList<SinhVien> listKha = new ArrayList<>();
        listRank.put("Kha", listKha);
        ArrayList<SinhVien> listTB = new ArrayList<>();
        listRank.put("Trung Binh", listTB);
        ArrayList<SinhVien> listYeu = new ArrayList<>();
        listRank.put("Yeu", listYeu);
        listSV.forEach((sv) -> {
            if (sv.getDtb() >= 8.0) {
                listRank.get("Gioi").add(sv);
            } else if (sv.getDtb() >= 7.0 && sv.getDtb() < 8.0) {
                listRank.get("Kha").add(sv);
            } else if (sv.getDtb() >= 5.0 && sv.getDtb() < 7.0) {
                listRank.get("Trung Binh").add(sv);
            } else {
                listRank.get("Yeu").add(sv);
            }
        });

        File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_9\\XEPLOAI.OUT");
        try {
            PrintWriter out = new PrintWriter(file);
            for (Map.Entry<String, ArrayList<SinhVien>> entry : listRank.entrySet()) {
                sortName(entry.getValue());
                out.println(entry.getKey());
                for (SinhVien sv : entry.getValue()) {
                    out.println(sv.toString());
                }
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        }
    }
}
