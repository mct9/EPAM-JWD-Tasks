package Task2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        String temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date:");
        System.out.print("Day: ");
        temp = scanner.nextLine();
           if (temp.charAt(0) == '0'){
            if (isValidinput(temp.substring(1))) {
                day = Integer.parseInt(temp.substring(1));
            } else {
                System.err.println("Wrong parametr");
                return;
            }
        } else {
            if (isValidinput(temp)) {
                day = Integer.parseInt(temp);
            } else {
                System.err.println("Wrong parametr");
                return;
            }
        }

        System.out.print("Month: ");
        temp = scanner.nextLine();
        if (temp.charAt(0) == '0') {
            if (isValidinput(temp.substring(1))) {
                month = Integer.parseInt(temp.substring(1));
            } else {
                System.err.println("Wrong parametr");
                return;
            }
        } else {
            if (isValidinput(temp)) {
                month = Integer.parseInt(temp);
            } else {
                System.err.println("Wrong parametr");
                return;
            }
        }

        System.out.print("Year: ");

        temp = scanner.nextLine();
        if (isValidinput(temp)) {
            year = Integer.parseInt(temp);
        } else {
            System.err.println("Wrong parametr");
            return;
        }
        dateProc(day, month, year);
    }

    private static boolean isValidinput(String string) {
        try {
            Integer.valueOf(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean checkDate(int d, int m, int y) {
        if ((d <= 0) || (d > 31)) {
            System.err.println("Wrong parametr date: " + d);
            return false;
        } else if ((m <= 0) || (m > 12)) {
            System.err.println("Wrong parametr month: " + m);
            return false;
        } else if (y <=0) {
            System.err.println("Wrong parametr year: " + y);
            return false;
        } else {
            return true;
        }
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 != 0)) {
            return false;
        }

        if ((year % 4 == 0) || ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    private static void showNextDate(int day, int month, int year) {
        StringBuilder str = new StringBuilder("Next date: ");

        if (day < 10){
            str.append("0" + day + "//");
        } else {
            str.append(day + "//");
        }
        if (month < 10) {
            str.append("0" + month + "//");
        } else {
            str.append(month + "//");
        }
        str.append(year);
        System.out.println(str);
    }

    private static void dateProc(int day, int month, int year) {
        int daysInFeb;
        int nextDay;
        int nextMonth;
        int nextYear;

        if(checkDate(day, month, year)) {
            if (isLeapYear(year)) {
                daysInFeb = 29;
            } else {
                daysInFeb = 28;
            }

            if ((month == 1) || (month == 3) || (month == 5) ||
                (month == 7) || (month == 8) || (month == 10)) {
                if (day <= 30) {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                    showNextDate(nextDay, nextMonth, nextYear);
                } else {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                    showNextDate(nextDay, nextMonth, nextYear);
                }
            } else if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                if (day <= 29) {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                    showNextDate(nextDay, nextMonth, nextYear);
                } else {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                    showNextDate(nextDay, nextMonth, nextYear);
                }
            } else if (month == 12) {
                if (day <= 30) {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                    showNextDate(nextDay, nextMonth, nextYear);
                } else {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear = year + 1;
                    showNextDate(nextDay, nextMonth, nextYear);
                }
            } else if (month == 2) {
                if (day <= daysInFeb - 1) {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                    showNextDate(nextDay, nextMonth, nextYear);
                } else {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                    showNextDate(nextDay, nextMonth, nextYear);
                }
            }
        }
    }
}
