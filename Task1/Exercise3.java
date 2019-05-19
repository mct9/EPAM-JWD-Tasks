package Task1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp;
        double r1;
        double r2;

        System.out.print("R1 = ");
        temp = scan.next();
        if (isValidInput(temp)) {
            r1 = Double.valueOf(temp);
        } else {
            System.err.println("Wrong parametr R1");
            return;
        }

        System.out.print("R2 = ");
        temp = scan.next();
        if (isValidInput(temp)) {
            r2 = Double.valueOf(temp);
        } else {
            System.err.println("Wrong parametr R2");
            return;
        }

        if (isValidParams(r1, r2)){
            System.out.println("The area of the ring: " + calcArea(r1, r2));
        }
    }

    private static boolean isValidParams(double r1, double r2) {
        if ((r1 < 0) || (r2 < 0)) {
            System.err.println("Radius cannot be a negative number.");
            return false;
        }
        if (r1 <= r2) {
            System.err.println("R2 must be less than R1");
            return false;
        } else {
            return true;
        }
    }

    private static boolean isValidInput(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double calcArea(double r1, double r2) {
            return (Math.PI * (Math.pow(r1, 2) - Math.pow(r2, 2)));

    }
}
