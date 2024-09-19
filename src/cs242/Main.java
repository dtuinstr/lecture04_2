package cs242;

public class Main {
    public static void main(String[] args) {
        Point origin = new Point(0,0);
        Point unitX = new Point(1, 0);
        Point unitY = new Point(0,1);

        Triangle q1 = new Triangle(origin, unitX, unitY);

        System.out.println("AT START:");
        System.out.println("q1: " + q1);
        System.out.println("Origin: " + origin);
        System.out.println("unitX: " + unitX);
        System.out.println("unitY: " + unitY);

        q1.moveUp(2);
        q1.slideOver(-0.5);

        System.out.println("AFTER TRANSLATING TRIANGLE");
        System.out.println("q1: " + q1);
        System.out.println("Origin: " + origin);
        System.out.println("unitX: " + unitX);
        System.out.println("unitY: " + unitY);
    }
}