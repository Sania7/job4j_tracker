package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Test;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import java.awt.*;

public class TriangleTest extends TestCase {
    @Test
    public void testPeriod() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }
}