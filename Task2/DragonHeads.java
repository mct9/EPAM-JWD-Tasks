package Task2;

import java.util.Scanner;

public class DragonHeads {
    public static void main(String[] args) {
        int N;
        String temp;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter count of years N: ");
        temp = scan.next();
        if (isValidInput(temp)) {
            N = Integer.parseInt(temp);
            if (N < 0) {
                System.err.println("Count of years must be greater or equals 0");
            } else {
                int countHeads = calcHeads(N);
                System.out.println("In " + N + " years dragon will have " + countHeads + " heads and " +(2 * countHeads) + " eyes.");
              }
        } else {
            System.err.println("Wrong parametr " + temp);
        }
    }

    private  static int calcHeads(int N) {
        int allCountHeads;
        int firstPeriod = 200;
        int secondPeriod = 300;
        int countHeadsAtBerth = 3;
        int addAtFirstPeriod = 3;
        int addAtSecondPeriod = 2;
        int addAtThirdPeriod = 1;

        if ((0 < N) && (N < firstPeriod)) {
            allCountHeads = countHeadsAtBerth + (N * addAtFirstPeriod);
            return allCountHeads;
        } else if ((N >= firstPeriod) && (N < secondPeriod)) {
            allCountHeads = countHeadsAtBerth + addAtFirstPeriod * (firstPeriod - 1) +
                            addAtSecondPeriod * (N - firstPeriod + 1);
            return allCountHeads;
        } else {
            allCountHeads = countHeadsAtBerth + addAtFirstPeriod * (firstPeriod - 1) +
                            addAtSecondPeriod * (secondPeriod - firstPeriod - 1) +
                            addAtThirdPeriod * (N - secondPeriod +1);
            return  allCountHeads;
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
}
