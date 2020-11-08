/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_8;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SoPhuc {

    private float a;
    private float b;

    public SoPhuc() {
        a = 0;
        b = 0;
    }

    public SoPhuc(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public SoPhuc cong(SoPhuc sp2) {
        float thuc = this.a + sp2.getA();
        float ao = this.a + sp2.getB();
        return new SoPhuc(thuc, ao);
    }

    public SoPhuc tru(SoPhuc sp2) {
        float thuc = this.a - sp2.getA();
        float ao = this.a - sp2.getB();

        return new SoPhuc(thuc, ao);
    }

    public SoPhuc nhan(SoPhuc sp2) {
        float thuc = this.a * sp2.getA() - this.b * sp2.getB();
        float ao = this.a * sp2.getB() + sp2.getA() * this.b;
        return new SoPhuc(thuc, ao);
    }

    public SoPhuc chia(SoPhuc sp2) {
        float thuc = (a * sp2.getA() + b * sp2.getB()) / (a * a + b * b);
        float ao = (a * sp2.getB() - sp2.getA() * b) / (a * a + b * b);
        return new SoPhuc(thuc, ao);
    }

    public SoPhuc nghichDao() {
        return new SoPhuc(a / (a * a + b * b), -b / (a * a + b * b));
    }

    public boolean bangNhau(SoPhuc sp2) {
        return (a == sp2.getA() && b == sp2.getB());
    }

    public boolean lonHon(SoPhuc sp2) {
        float modulFirst = (float) Math.sqrt(a * a + b * b);
        float modulSecond = (float) Math.sqrt(sp2.getA() * sp2.getA() + sp2.getB() * sp2.getB());

        return (modulFirst > modulSecond);
    }

    public boolean nhoHon(SoPhuc sp2) {
        float modulFirst = (float) Math.sqrt(a * a + b * b);
        float modulSecond = (float) Math.sqrt(sp2.getA() * sp2.getA() + sp2.getB() * sp2.getB());

        return (modulFirst < modulSecond);
    }

    public void hien() {
        System.out.println(a + "+" + "i(" + b+")");
    }

    public void nhap(Scanner sc) {
        String s = sc.nextLine();
        String temp[] = s.split(" ");
        float thuc = Float.parseFloat(temp[0]);
        float ao = Float.parseFloat(temp[2].substring(1));
        this.a = thuc;
        this.b = ao;
    }
}
