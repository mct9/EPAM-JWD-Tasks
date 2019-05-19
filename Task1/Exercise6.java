package Task1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp;

        System.out.print("Enter number with seven digits: ");
        temp = scan.next();

        if (((temp.length() > 7) && (temp.charAt(0) != '-')) ||
                ((temp.length() == 7) && (temp.charAt(0) == '-')) ||
                temp.length() < 7) {
            System.err.println("Number must be seven digits.");
            return;
        }

        if (isValidInput(temp)) {
           /* StringBuffer buff = new StringBuffer(temp);
            System.out.println("Reverse number: " + buff.reverse());*/
            System.out.println("Reverse number: " + reverseNumber(temp));
        } else {
            System.err.println("Wrong parametr " + temp);
        }
    }

    private static int reverseNumber(String num) {
        boolean sign = false;
        int temp;
        int result;

        if (num.charAt(0) == '-') {
            sign = true;
        }
        temp =  Math.abs(Integer.parseInt(num));
        result = (temp % 10) * 1000000 + (temp / 10 % 10) * 100000 + (temp / 100 % 10) * 10000 +
                 (temp / 1000 % 10) * 1000 + (temp / 10000 % 10) * 100 + (temp / 100000 % 10) * 10 +
                 (temp / 1000000);

        return (sign ? -result : result);
    }

    private static boolean isValidInput(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
