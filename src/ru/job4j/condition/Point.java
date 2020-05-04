package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first,int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public static double distance3d(Point first, Point second) {
        return sqrt(pow(second.x - first.x, 2) + pow(second.y - first.y, 2) + pow(second.z - first.z,2));
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(5, 4,9 );
        Point b = new Point(2, 8,5);
        double dist = a.distance(b);
        System.out.println(dist);
        double dist3d = a.distance3d(a,b);
        System.out.println(dist3d);
    }
}

