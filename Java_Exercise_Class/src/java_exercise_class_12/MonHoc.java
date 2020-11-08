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

public class MonHoc {

    private int maMon;
    private String tenMon;
    private String nhomMon;
    private int soTinChi;

    public MonHoc() {
    }

    public MonHoc(int maMon, String tenMon, String nhomMon, int soTinChi) throws MonHocException {
        if (maMon < 1000 || maMon > 9999) {
            throw new MonHocException("Ma mon phai co 4 chu so");
        }
        if (tenMon.matches("")) {
            throw new MonHocException("Ten mon khong duoc de trong");
        }
        if (soTinChi < 0 || soTinChi > 7) {
            throw new MonHocException("So tin chi khong hop le");
        }
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.nhomMon = nhomMon;
        this.soTinChi = soTinChi;
    }

    public int getMaMon() {
        return maMon;
    }

    public String getTenMon() {
        return tenMon;
    }

    public String getNhomMon() {
        return nhomMon;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + nhomMon + " " + soTinChi;
    }

    private static void sortTC(ArrayList<MonHoc> listSubject) {
        Collections.sort(listSubject, (MonHoc mh1, MonHoc mh2) -> {
            double tc1 = mh1.getSoTinChi();
            double tc2 = mh2.getSoTinChi();
            return tc1 > tc2 ? -1 : 1;
        });
    }

    private static void sortName(ArrayList<MonHoc> listSubject) {
        Collections.sort(listSubject, (MonHoc mh1, MonHoc mh2) -> {
            String name1 = mh1.getTenMon();
            String name2 = mh2.getTenMon();
            return name1.compareTo(name2);
        });
    }

    public static void printListBooks(ArrayList<MonHoc> listSubject) {
        sortTC(listSubject);
        try {
            File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_12\\SX.OUT");
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            for (MonHoc sub : listSubject) {
                out.write(sub.toString());
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Khong ghi duoc file");
        }
    }

    public static void printListMajor(ArrayList<MonHoc> listSubject) {
        Map<String, ArrayList<MonHoc>> listMajor = new HashMap<>();

        listSubject.forEach((sub) -> {
            if (listMajor.containsKey(sub.getNhomMon())) {
                listMajor.get(sub.getNhomMon()).add(sub);
            } else {
                ArrayList<MonHoc> subs = new ArrayList<>();
                subs.add(sub);
                listMajor.put(sub.getNhomMon(), subs);
            }
        });

        try {
            File file = new File("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\Java_Exercise_Class\\src\\java_exercise_class_12\\NHOM.OUT");
            PrintWriter out = new PrintWriter(file);
            for (Map.Entry<String, ArrayList<MonHoc>> entry : listMajor.entrySet()) {
                out.println(entry.getKey());
                sortName(entry.getValue());
                entry.getValue().forEach((mh) -> {
                    out.println(mh.toString());
                });
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Khong ghi duoc file");
        }
    }
}
