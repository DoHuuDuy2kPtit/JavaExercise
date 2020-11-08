/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_exercise_class_5;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MyPoint> listPoints = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();

            double y = sc.nextDouble();

            MyPoint p = new MyPoint(x, y);

            listPoints.add(p);
        }
        double max = 0;
        MyPoint firstPoint = new MyPoint();
        MyPoint secondPoint = new MyPoint();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = MyPoint.distance(listPoints.get(i), listPoints.get(j));

                if (dist > max) {
                    max = dist;
                    firstPoint = new MyPoint(listPoints.get(i));
                    secondPoint = new MyPoint(listPoints.get(j));
                }
            }
        }

        System.out.println("Diem 1: (" + firstPoint.getX() + "," + firstPoint.getY() + ")");
        System.out.println("Diem 2: (" + secondPoint.getX() + "," + secondPoint.getY() + ")");
        System.out.println("Khoang cach toi da la " + max);

    }
}
