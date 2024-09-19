package cs242;

/**
 * Representation of a point on a 2-D plane.
 */
public class Point {
    final double x;
    final double y;

    /**
     * Factory method that creates a point from polar coordinates, with
     * an angle given in radians.
     * @param r the radius
     * @param radians the angle in radians, measured from the positive x-axis.
     * @pre.cond This is a pre-condition.
     * @return the point at the given radius and angle.
     */
    public static Point fromPolarRadians(double r, double radians) {
        double x = r * Math.cos(radians);
        double y = r * Math.sin(radians);
        return fromCartesian(x, y);
    }

    /**
     * Factory method that creates a point from polar coordinates, with
     * an angle given in degrees.
     * @param r the radius.
     * @param degrees the angle in degrees, measured from the positive x-axis.
     * @return the point at the given radius and angle.
     */
    public static Point fromPolarDegrees(double r, double degrees) {
        double radians = Math.toRadians(degrees);
        return fromPolarRadians(r, radians);
    }

    /**
     * Factory method that creates a point from Cartesian coordinates. This
     * method returns the same result as <tt>new Point(x, y)</tt>.
     * @param x the point's x value.
     * @param y the point's y value.
     * @return a point at the given Cartesian coordinates.
     */
    public static Point fromCartesian(double x, double y) {
        return new Point(x, y);
    }

    /**
     * Constructs a point from Cartesian coordinates. The Point is the
     * same as returned by cs242.Point.fromCartesian(x, y).
     * @param x the x-axis value for the point.
     * @param y the y-axis value for the point.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a string representation of the point: the x and y
     * coordinates separated by ", ", all between parentheses.
     * @return
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Returns the radius component of polar notation. The returned
     * value is always positive or zero.
     * @return the radius.
     */
    public double getRadius()
    {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Returns the angle component of polar notation in radians, as
     * measured from the positive horizontal axis. The returned
     * value is in the range [0, 2 * pi). If the point in question
     * is the origin, by convention this methods returns 0.
     * @return the polar-coordinate angle, in radians.
     */
    public double getRadians() {
        // Special case: the origin.
        if (x == 0 && y == 0) {
            return 0;
        }
        // Remaining cases
        double angle = Math.acos(x / getRadius());
        if (y >= 0) { // right-hand quadrants
            return angle;
        } else {
            return (2 * Math.PI) - angle;
        }
    }

    /**
     * Returns the angle component of polar notation in degrees, as
     * measured from the positive horizontal axis. The
     * returned value is in the range [0, 360).
     * @return the polar-coordinate angle, in degrees.
     */
    public double getDegrees() {
        return Math.toDegrees(getRadians());
    }

    /**
     * Returns the x-coordinate.
     * @return the x-coordinate.
     */
    public double getX() {
        return this.x;
    }

    /**
     * Returns the y-coordinate.
     * @return the y-coordinate.
     */
    public double getY() {
        return this.y;
    }
}
