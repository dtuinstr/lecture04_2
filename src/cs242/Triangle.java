package cs242;

public class Triangle {
    Point A;
    Point B;
    Point C;

    /**
     * Construct triangle with given corner points.
     * @param A the first corner
     * @param B the second corner
     * @param C the third corner
     */
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public String toString() {
        return "{Triangle: " + A + ", " + B + ", "  + C + "}";
    }

}
