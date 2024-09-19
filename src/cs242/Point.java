package cs242;

/**
 * Representation of a point on a 2-D plane.
 */
public class Point {
    public double x;
    public double y;
    public double r;
    public double theta;
    public double degrees;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double arg1, double arg2, boolean polar) {
        if (polar) {
            this.x = arg1 * Math.cos(arg2);
            this.y = arg1 * Math.sin(arg2);
        } else {
            this.x = arg1;
            this.y = arg2;
        }
    }

    /**
     * Computes the radius and stores it in the field r.
     */
    public void computeRadius() {
        this.r = Math.sqrt(x * x + y * y);
    }

    /**
     * Returns the angle, in radians of this point's
     * polar coordinate representation. Compute the
     * radius before this call.
     * @return the angle in radians.
     */
    public double getTheta() {
        return Math.acos(x/this.r);
    }

    /**
     * Compute and return the degree measure of the
     * angle, if this point was expressed in polar
     * co-ordinates. The radius must be computed before
     * calling this method!
     * @return the degree of the angle.
     */
    public double getAngleInDegrees() {
        return Math.toDegrees(getTheta());
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
