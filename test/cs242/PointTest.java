package cs242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    final Point ORIGIN = new Point(0, 0);

    Point p1 = new Point(0, 3);
    Point p2 = new Point(4, 0);
    Point pQ1 = new Point(1, 1);
    Point pQ2 = new Point(-1, 1);
    Point pQ3 = new Point(-1, -1);
    Point pQ4 = new Point(1, -1);

    @Test
    void getX() {
        assertEquals(0, ORIGIN.getX());
        assertEquals(4, p2.getX());
    }

    @Test
    void getY() {
        assertEquals(0, ORIGIN.getY());
        assertEquals(3, p1.getY());
    }

    @Test
    void getPolarRadius() {
        for (Point p : new Point[] {pQ1, pQ2, pQ3, pQ4}) {
            assertEquals(Math.sqrt(2), p.getPolarRadius());
        }

        assertEquals(3, p1.getPolarRadius());
        assertEquals(0, ORIGIN.getPolarRadius());
    }

    @Test
    void getPolarAngleRadians() {
        double tolerance = 1e-12;
        assertEquals(0, p2.getPolarAngleRadians(), tolerance);
        assertEquals(Math.PI / 4, pQ1.getPolarAngleRadians(), tolerance);
        assertEquals(Math.PI / 2, p1.getPolarAngleRadians(), tolerance);
    }

    @Test
    void getPolarAngleDegrees() {
    }

    @Test
    void distanceTo() {
        assertEquals(5, p1.distanceTo(p2));
        assertEquals(5, p2.distanceTo(p1));
        assertEquals(0, p2.distanceTo(p2));
    }

    @Test
    void testToString() {
    }

    @Test
    void testEquals() {
        assertFalse(p1.equals(p2));
        assertFalse(new Point(0, 2).equals(new Point(2, 0)));
        assertFalse(new Point(0, 2).equals(new Point(0.00001, 2)));
        assertFalse(p1.equals(null));
        assertFalse(p1.equals(""));

        assertTrue(p1.equals(p1));
        assertTrue(p1.equals(new Point(p1)));
        assertTrue(p1.equals(new Point(p1.getX(), p1.getY())));

    }
}