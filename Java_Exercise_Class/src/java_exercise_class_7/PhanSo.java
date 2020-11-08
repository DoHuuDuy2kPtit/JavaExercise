/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PhanSo {

    private int ts;
    private int ms;

    private int UCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public PhanSo() {
        ts = 0;
        ms = 1;
    }

    public PhanSo(int ts, int ms) {
        try {
            if (ms != 0) {
                this.ts = ts;
                this.ms = ms;
            } else {
                throw new PhanSoException();
            }
        } catch (PhanSoException e) {
            System.out.println("Khoi tao phan that bai");
        }
    }

    public int getTs() {
        return ts;
    }

    public int getMs() {
        return ms;
    }

    public PhanSo cong(PhanSo ps2) {
        int msc = 1;
        int newTs = 0;
        msc = ms * ps2.getMs() / UCLN(ms, ps2.getMs());
        newTs = ts * msc / ms + ps2.getTs() * msc / ps2.getMs();

        return new PhanSo(newTs, msc);
    }

    public PhanSo tru(PhanSo ps2) {
        int msc = 1;
        int newTs = 0;
        msc = ms * ps2.getMs() / UCLN(ms, ps2.getMs());
        newTs = ts * msc / ms - ps2.getTs() * msc / ps2.getMs();
        return new PhanSo(newTs, msc);
    }

    public PhanSo nhan(PhanSo ps2) {
        int newMs = 1;
        int newTs = 0;
        newMs = ms * ps2.getMs();
        newTs = ts * ps2.getTs();
        return new PhanSo(newTs, newMs);
    }

    public PhanSo chia(PhanSo ps2) {
        int newMs = 1;
        int newTs = 0;
        try {
            if (ps2.getTs() != 0) {
                newMs = ms * ps2.getTs();
                newTs = ts * ps2.getMs();
            } else {
                throw new PhanSoException();
            }
        } catch (PhanSoException e) {
            System.out.println("Khong the chia voi phan so co mau bang 0");
        }
        return new PhanSo(newTs, newMs);
    }

    public PhanSo nghichDao() {
        try {
            if (ts != 0) {
                return new PhanSo(ms, ts);
            } else {
                throw new PhanSoException();
            }
        } catch (PhanSoException e) {
            System.out.println("Khong the nghich dao phan so neu tu hoac mau bang 0");
        }
        return new PhanSo();
    }

    public PhanSo doiDau() {
        return new PhanSo(-ts, -ms);
    }

    public PhanSo toiGian() {
        int temp = UCLN(ts, ms);
        ts = ts / temp;
        ms = ms / temp;
        return this;
    }

    public boolean bangNhau(PhanSo ps2) {
        this.toiGian();
        ps2.toiGian();
        return (ts == ps2.getTs() && ms == ps2.getMs());
    }

    public boolean lonHon(PhanSo ps2) {
        PhanSo sub = this.tru(ps2);
        return (sub.getTs() > 0 && sub.getMs() > 0);
    }

    public boolean nhoHon(PhanSo ps2) {
        PhanSo sub = this.tru(ps2);
        return (sub.getTs() < 0 || sub.getMs() < 0);
    }

    public void hien() {
        System.out.println(ts + "/" + ms);
    }

    public void nhap(Scanner sc) {
        String[] ps = sc.next().split("/");
        try {
            if (Integer.parseInt(ps[1]) != 0) {
                ts = Integer.parseInt(ps[0]);
                ms = Integer.parseInt(ps[1]);
            } else {
                throw new PhanSoException();
            }
        } catch(PhanSoException e){
            System.out.println("Phan so nhap vao ko hop le");
        }
    }
}
