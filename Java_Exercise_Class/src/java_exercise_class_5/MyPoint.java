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
public class MyPoint {

    private double x;
    private double y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint(MyPoint p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(MyPoint secondPoint) {
        return Math.sqrt((x - secondPoint.getX()) * (x - secondPoint.getX()) + (y - secondPoint.getY()) * (y - secondPoint.getY()));
    }

    public static double distance(MyPoint a1, MyPoint a2) {
        return Math.sqrt((a1.getX() - a2.getX()) * (a1.getX() - a2.getX()) + (a1.getY() - a2.getY()) * (a1.getY() - a2.getY()));
    }
}
