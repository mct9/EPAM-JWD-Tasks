package Task2;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        String string;
        Scanner scan = new Scanner(System.in);

        System.out.print("x1 = ");
        string = scan.next();
        if (!isValidinput(string)) {
            System.err.println("Wrong input.");
            return;
        } else {
            p1.x = Double.parseDouble(string);
        }

        System.out.print("y1 = ");
        string = scan.next();
        if (!isValidinput(string)) {
            System.err.println("Wrong input.");
            return;
        } else {
            p1.y = Double.parseDouble(string);
        }
        System.out.println();

        System.out.print("x2 = ");
        string = scan.next();
        if (!isValidinput(string)) {
            System.err.println("Wrong input.");
            return;
        } else {
            p2.x = Double.parseDouble(scan.next());
        }
        System.out.print("y2 = ");
        string = scan.next();
        if (!isValidinput(string)) {
            System.err.println("Wrong input.");
            return;
        } else {
            p2.y = Double.parseDouble(scan.next());
        }
        System.out.println();

        System.out.print("x3 = ");
        string = scan.next();
        if (!isValidinput(string)) {
            System.err.println("Wrong input.");
            return;
        } else {
            p3.x = Double.parseDouble(scan.next());
        }
        System.out.print("y3 = ");
        string = scan.next();
        if (!isValidinput(string)) {
            System.err.println("Wrong input.");
            return;
        } else {
            p3.y = Double.parseDouble(scan.next());
        }
        System.out.println();

        if (isTriangle(p1, p2, p3)) {
            System.out.println("Points form a triangle.");
            if (checkRightAngledTriangle(p1, p2, p3)) {
                System.out.println("Form right angled triangle.");
            } else {
                System.out.println("Don't form a right angled triangle.");
            }
        } else {
            System.out.println("Points don't form a triangle.");
        }

    }

    private static boolean checkRightAngledTriangle(Point point1, Point point2, Point point3) {
        double AB;
        double BC;
        double CA;

        AB = ThPifagora(point1, point2);
        BC = ThPifagora(point2, point3);
        CA = ThPifagora(point3, point1);

        if ( ((Math.abs(Math.pow(AB, 2) - (Math.pow(BC, 2) + Math.pow(CA, 2)))) < 0.01) ||
             ((Math.abs(Math.pow(BC, 2) - (Math.pow(AB, 2) + Math.pow(CA, 2)))) < 0.01) ||
             ((Math.abs(Math.pow(CA, 2) - (Math.pow(BC, 2) + Math.pow(AB, 2)))) < 0.01)) {
                return true;
        } else {
            return false;
        }
    }

    private static double ThPifagora(Point p1, Point p2) {
        double a;
        double b;

        a = Math.abs(p1.x - p2.x);
        b = Math.abs(p1.y - p2.y);
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    private static boolean isTriangle(Point p1, Point p2, Point p3) {
        if ((p1.x == p2.x) && (p1.y == p2.y)) {
            return false;
        }
        if ((p1.x == p3.x) && (p1.y == p3.y)) {
            return false;
        }
        if ((p2.x == p3.x) && (p2.y == p3.y)) {
            return false;
        }

        if ((p1.x == p2.x) && (p1.x == p3.x)) {
            return false;
        } else if ((p1.y == p2.y) && (p1.y == p3.y)) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isValidinput(String string) {
        try {
            Double.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}