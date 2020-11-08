/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_7;

/**
 *
 * @author admin
 */
import java.util.*;
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        ps1.nhap(sc);
        
        PhanSo ps2 = new PhanSo();
        ps2.nhap(sc);
        
        PhanSo sum = ps1.cong(ps2);
        sum.hien();
        
        PhanSo sub = ps1.tru(ps2);
        sub.hien();
        
        PhanSo mul = ps1.nhan(ps2);
        mul.hien();
        
        PhanSo div = ps1.chia(ps2);
        div.hien();
        
        if(ps1.bangNhau(ps2)) System.out.println("Hai phan so bang nhau");
        else if(ps1.lonHon(ps2)) System.out.println("Phan so 1 lon hon phan so 2");
        else System.out.println("Phan So 1 nho hon phan so 2");
    }
}
