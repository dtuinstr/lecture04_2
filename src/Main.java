import cs242.Point;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();

        double[] coords = {-1, 0, 1};

        for (double x : coords) {
            for (double y : coords) {
                points.add(new Point(x, y));
            }
        }

        for (Point p : points) {
            System.out.println(p);
            System.out.println("  x:       " + p.getX());
            System.out.println("  y:       " + p.getY());
            System.out.println("  radius:  " + p.getRadius());
            System.out.println("  radians: " + p.getRadians());
            System.out.println("  degrees: " + p.getDegrees());
        }

    }
}