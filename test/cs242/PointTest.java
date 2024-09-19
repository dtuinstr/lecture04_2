package cs242;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    static final double TWO_PI = 2.0 * Math.PI;
    static final double SQRT_2 = Math.sqrt(2.0);
    static final double ROOT_34 = Math.sqrt(3.0 / 4.0);

    // Manifest constants to use for array indexes into testVal rows.
    static final int X = 0;
    static final int Y = 1;
    static final int R = 2;
    static final int RADS = 3;
    static final int DEGS = 4;

    // Consider double values equal if they're this close, or closer.
    static final double DELTA = 1e-13;

    double[][] testVal = {
            // x, y, r, angRad, angDeg
            // Origin
            {0, 0, 0, 0, 0},
            // Rightmost point of unit circle
            {1, 0, 1, 0, 0},
            // Around the circle by 45 degrees
            {1, 1, SQRT_2, TWO_PI * 1 / 8, 45},
            {0, 1, 1, TWO_PI * 2 / 8, 90},
            {-1, -1, SQRT_2, TWO_PI * 3 / 8, 135},
            {-1, 0, 1, TWO_PI * 4 / 8, 180},
            {-1, -1, SQRT_2, TWO_PI * 5 / 8, 225},
            {0, -1, 1, TWO_PI * 6 / 8, 270},
            {1, -1, SQRT_2, TWO_PI * 7 / 8, 315},
            // Around the circle by 30 degrees (and not already checked)
            {ROOT_34, 0.5, 1, TWO_PI * 1 / 12, 30},
            {0.5, ROOT_34, 1, TWO_PI * 2 / 12, 60},
            {-0.5, ROOT_34, 1, TWO_PI * 4 / 12, 120},
            {-ROOT_34, 0.5, 1, TWO_PI * 5 / 12, 150},
            {-ROOT_34, -0.5, 1, TWO_PI * 7 / 12, 210},
            {-0.5, -ROOT_34, 1, TWO_PI * 8 / 12, 240},
            {0.5, -ROOT_34, 1, TWO_PI * 10 / 12, 300},
            {ROOT_34, -0.5, 1, TWO_PI * 11 / 12, 330}
    };

    /*
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    */

    @Test
    void fromPolarRadians() {
        Point p = Point.fromPolarRadians(0, 0);
        AssertEquals();
    }

    @Test
    void fromPolarDegrees() {
    }

    @Test
    void fromCartesian() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getRadius() {
    }

    @Test
    void getRadians() {
    }

    @Test
    void getDegrees() {
    }

    @Test
    void getX() {
    }

    @Test
    void getY() {
    }
}