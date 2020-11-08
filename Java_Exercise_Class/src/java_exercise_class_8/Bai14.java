/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_8;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SoPhuc sp1 = new SoPhuc();

        sp1.nhap(sc);

        SoPhuc sp2 = new SoPhuc();
        sp2.nhap(sc);
        System.out.println("Tong la: ");
        SoPhuc sum = sp1.cong(sp2);
        sum.hien();
        System.out.println("Hieu la: ");
        SoPhuc sub = sp1.tru(sp2);
        sub.hien();
        System.out.println("Tich la: ");
        SoPhuc mul = sp1.nhan(sp2);
        mul.hien();
        System.out.println("Thuong la: ");
        SoPhuc div = sp1.chia(sp2);
        div.hien();
        System.out.println("Nghich dao la: ");
        SoPhuc dao = sp1.nghichDao();
        dao.hien();
        
        if(sp1.bangNhau(sp2)) System.out.println("Hai so thuc bang nhau");
        else if(sp1.lonHon(sp2)) System.out.println("So thuc thu nhat lon hon so thuc thu hai");
        else System.out.println("So thuc thu nhat nho hon so thuc thu hai");
    }
}
