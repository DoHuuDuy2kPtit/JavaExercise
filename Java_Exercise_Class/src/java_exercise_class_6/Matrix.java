/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_6;

/**
 *
 * @author admin
 */
import java.util.*;

public class Matrix {

    private float a[][];

    public float[][] getA() {
        return a;
    }

    public void setA(float[][] a) {
        this.a = a;
    }

    public Matrix() {
        this.a = new float[3][3];
    }

    public Matrix(int rows, int cols) {
        this.a = new float[rows][cols];
    }

    public Matrix add(Matrix m) {
        Matrix temp = new Matrix(a.length, a[0].length);
        float[][] sum = new float[a.length][a[0].length];
        try {
            if (a.length == m.getA().length && a[0].length == m.getA()[0].length) {
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        sum[i][j] = a[i][j] + m.getA()[i][j];
                    }
                }
                temp.setA(sum);
            } else {
                throw new SizeException();
            }
        } catch (SizeException e) {
            System.out.println("Two matrixes are not same size");
        }
        return temp;
    }

    public Matrix sub(Matrix m) {
        Matrix temp = new Matrix(a.length, a[0].length);
        float[][] sub = new float[a.length][a[0].length];
        try {
            if (a.length == m.getA().length && a[0].length == m.getA()[0].length) {
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a[i].length; j++) {
                        sub[i][j] = a[i][j] - m.getA()[i][j];
                    }
                }
                temp.setA(sub);
            } else {
                throw new SizeException();
            }
        } catch (SizeException e) {
            System.out.println("Two matrixes are not same size");
        }
        return temp;
    }

    public Matrix mul(Matrix m) {
        float res[][] = new float[a.length][m.getA()[0].length];
        Matrix temp = new Matrix(a.length, m.getA()[0].length);

        try {
            if (a[0].length == m.getA().length) {
                for (int i = 0; i < res.length; i++) {
                    for (int j = 0; j < res[0].length; j++) {
                        res[i][j] = 0;
                        for (int k = 0; k < m.getA().length; k++) {
                            res[i][j] += a[i][k] * m.getA()[k][j];
                        }
                    }
                }
                temp.setA(res);
            } else {
                throw new SizeException();
            }
        } catch (SizeException e) {
            System.out.println("Multiplication NOT POSSIBLE");
        }
        return temp;
    }

    public Matrix neg() {
        for (float[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = -a1[j];
            }
        }
        return this;
    }

    public Matrix transpose() {
        float arr[][] = new float[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                arr[i][j] = a[j][i];
            }
        }
        Matrix temp = new Matrix(a[0].length, a.length);
        temp.setA(arr);
        return temp;
    }

    public void print() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextFloat();
            }
        }
    }
}
