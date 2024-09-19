package cs242;

public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        if (radius < 0) {
            throw new IllegalArgumentException("negative radius not allowed");
        }
        this.center = new Point(0,0);
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("negative radius not allowed");
        }
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getRadius() {
        return this.radius;
    }

    public String toString() {
        return "{Circle: " + center + ", " + radius + "}";
    }
}
