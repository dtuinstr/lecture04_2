package cs242;

public class Triangle {
    private Point A;
    private Point B;
    private Point C;

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

    public void moveUp(double deltaY) {
        A.y += deltaY;
        B.y += deltaY;
        C.y += deltaY;
    }

    public void slideOver(double distanceLeftOrRight) {
        A.x += distanceLeftOrRight;
        B.x += distanceLeftOrRight;
        C.x += distanceLeftOrRight;
    }

    public String toString() {
        return "{Triangle: " + A + ", " + B + ", "  + C + "}";
    }

}
