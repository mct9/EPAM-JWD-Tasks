package Task1;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        BigInteger num1;
        BigInteger num2;
        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("num1 = ");
            num1 = new BigInteger(scan.next());
            System.out.print("num2 = ");
            num2 = new BigInteger(scan.next());
        } catch (NumberFormatException e) {
            System.err.println("Wrong parametr");
            return;
        }

        if (num1.compareTo(num2) == 0) {
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
        } else {
            swapNumbers1(num1, num2);
            swapNumbers2(num1, num2);
        }
    }

    private static void swapNumbers1(BigInteger num1, BigInteger num2) {
        num1 = num1.multiply(num2);
        num2 = num1.divide(num2);
        num1 = num1.divide(num2);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    private static void swapNumbers2(BigInteger num1, BigInteger num2) {
        num1 = num1.add(num2);
        num2 = num1.subtract(num2);
        num1 = num1.subtract(num2);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
