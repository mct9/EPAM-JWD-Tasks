package Task1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp;
        int number;

        System.out.print("Enter number: ");
        temp = scan.next();

        if (((temp.length() > 4) && (temp.charAt(0) != '-')) ||
            ((temp.length() == 4) && (temp.charAt(0) == '-')) ||
            temp.length() < 4) {
            System.err.println("Number must be four digits.");
            return;
        }
        if (isValidInput(temp)) {
            number = Math.abs(Integer.parseInt(temp));
            System.out.println(checkingDigits(number));
        } else {
            System.err.println("Wrong parametr " + temp);
        }
    }

    private static boolean isValidInput(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String checkingDigits(int num) {
        int a;
        int b;
        int c;
        int d;
        boolean flag1 = false;  //if the numbers increase
        boolean flag2 = false;  //If the numbers decrease

        a = num / (int) Math.pow(10, 3);
        num %= (int) Math.pow(10, 3);
        b = num / (int) Math.pow(10, 2);
        num %= (int) Math.pow(10, 2);
        c = num / 10;
        num %= 10;
        d = num;

        if ((a < b) && (b < c) && (c < d)){
            flag1 = true;
        } else if ((a > b) && (b > c) && (c > d)){
            flag2 = true;
        }

        if ((flag1 == true) && (flag2 == false)) {
            return "Numbers in form an increase sequence.";
        } else if ((flag1 == false) && (flag2 == true)) {
            return "Numbers in form an decrease sequence.";
        } else return "Numbers in don't form any sequence.";
    }
}
