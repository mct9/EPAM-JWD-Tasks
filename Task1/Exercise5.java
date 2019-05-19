package Task1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp;
        int number;

        System.out.print("Enter number with six digits: ");
        temp = scan.next();

        if (((temp.length() > 6) && (temp.charAt(0) != '-')) ||
                ((temp.length() == 6) && (temp.charAt(0) == '-')) ||
                temp.length() < 6) {
            System.err.println("Number must be six digits.");
            return;
        }
        if (isValidInput(temp)) {
            number = Math.abs(Integer.parseInt(temp));
            System.out.println("Average summ: " + averageSum(number));
            System.out.println("Average geom: " + averageGeom(number));
            System.out.println("Second way:");
            calcProc(temp);
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

    private static void calcProc(String str) {
        int sum;
        int mult;

        sum = Integer.parseInt(str.substring(0,1)) + Integer.parseInt(str.substring(1,2)) +
              Integer.parseInt(str.substring(2,3)) + Integer.parseInt(str.substring(3,4)) +
              Integer.parseInt(str.substring(4,5)) + Integer.parseInt(str.substring(5,6));

        mult = Integer.parseInt(str.substring(0,1)) * Integer.parseInt(str.substring(1,2)) *
                Integer.parseInt(str.substring(2,3)) * Integer.parseInt(str.substring(3,4)) *
                Integer.parseInt(str.substring(4,5)) * Integer.parseInt(str.substring(5,6));

        System.out.println("Average summ: " + ((double) sum) / 6);
        System.out.println("Average geom: " + Math.pow(mult, 1.0 / 6));
    }

    private static double averageSum(int num) {
        int sum;

        sum = num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;
        num /= 10;
        sum += num % 10;

        return ((double)sum / 6);

        /*int counter = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
            counter++;
        }
        return ((double)sum / counter);*/
    }

    private static double averageGeom(int num) {
        int mult;

        mult = num % 10;
        num /=10;
        mult *= num % 10;
        num /=10;
        mult *= num % 10;
        num /=10;
        mult *= num % 10;
        num /=10;
        mult *= num % 10;
        num /=10;
        mult *= num % 10;

        return Math.pow(mult, 1.0 / 6);

        /*int counter = 0;
        while (num != 0) {
            mult *= num % 10;
            num /= 10;
            counter++;
        }
        return Math.pow(mult, 1 / counter);*/
    }
}
