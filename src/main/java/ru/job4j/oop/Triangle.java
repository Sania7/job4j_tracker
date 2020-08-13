package ru.job4j.oop;

import java.awt.*;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ab + bc > ac && ac + bc > ab;
        }
    public double area() {
        double rsl = 0.1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);
        double p = period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
      return rsl;
    }
}