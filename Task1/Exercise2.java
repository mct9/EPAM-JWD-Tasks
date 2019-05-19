package Task1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp;

        System.out.print("Enter the mass of the dinosaur in kilograms: ");
        temp = scan.next();
        if (inputCheck(temp)) {
            transferMass(Double.valueOf(temp));
        } else {
            System.err.println("Wrong parametr.");
        }
    }

    private static boolean inputCheck(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void transferMass(double mass) {
        if (mass < 0) {
            System.err.println("Mass cannot be a negative number.");
            return;
        } else if (mass == 0) {
            System.err.println("Mass must be greater than zero.");
            return;
        }
        System.out.println("The mass of the dinosaur in milligramms: " + (mass * Math.pow(10, 6)));
        System.out.println("The mass of the dinosaur in gramms: " + (mass * Math.pow(10, 3)));
        System.out.println("The mass of the dinosaur in tons: " + (mass * Math.pow(10, -3)));
    }
}
