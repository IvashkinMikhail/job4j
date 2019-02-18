package ru.job4j.condition;

/**
 * @author Mikhail Ivashkin
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private final int pointx;
    private final int pointy;

    public Point(int x, int y) {
        this.pointx = x;
        this.pointy = y;
    }

    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.pointx - that.pointx, 2) + Math.pow(this.pointy - that.pointy, 2)
        );
    }

    public static void main(String[] args) {
        Point a = new Point(5, 10);
        Point b = new Point(1, 1);
        // сделаем вызов метода
        System.out.println("x1 = " + a.pointx);
        System.out.println("y1 = " + a.pointy);
        System.out.println("x2 = " + b.pointx);
        System.out.println("y2 = " + b.pointy);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }
}