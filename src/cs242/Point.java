package cs242;

import java.util.Objects;

/**
 * Representation of a point on a 2-D plane.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copy constructor.
     * @param p the point to copy.
     */
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPolarRadius() {
        return Math.sqrt(x * x + y * y);
    }

    public double getPolarAngleRadians() {
        double result = Math.acos(x / getPolarRadius());
        if (y >= 0) {
            return result;
        } else {
            return Math.PI * 2 - result;
        }
    }

    public double getPolarAngleDegrees() {
        return Math.toDegrees(getPolarAngleRadians());
    }

    /**
     * Computes the distance from this point to the other point.
     * @param other the other point
     * @return distance from this to the other point.
     */
    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(x, point.x) == 0 && Double.compare(y, point.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
