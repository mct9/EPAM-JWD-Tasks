package Task1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        String temp;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three integers:");
        System.out.print("a = ");
        temp = scan.next();
        if (inputCheck(temp)) {
            a = Integer.valueOf(temp);
        } else {
            System.err.println("Wrong parametr a");
            return;
        }

        System.out.print("b = ");
        temp = scan.next();
        if (inputCheck(temp)) {
            b = Integer.valueOf(temp);
        } else {
            System.err.println("Wrong parametr b");
            return;
        }

        System.out.print("c = ");
        temp = scan.next();
        if (inputCheck(temp)) {
            c = Integer.valueOf(temp);
        } else {
            System.err.println("Wrong parametr c");
            return;
        }

        equalityCheck(a, b, c);
    }

    private static boolean inputCheck(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void equalityCheck(int a, int b, int c) {
        if ((a == b) && (b == c)) {
            System.out.println("All numbers are equal");
        } else if (a == b) {
            System.out.println("a equal b");
        } else if (b == c) {
            System.out.println("b equal c");
        } else if (a == c) {
            System.out.println("a equal c");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
