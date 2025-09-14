//Write a program that takes a year as input and outputs the Year is a Leap Year or not 

import java.util.Scanner;

public class LeapYearChecker {
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap year check only valid for year >= 1582.");
            return;
        }

        LeapYearChecker checker = new LeapYearChecker();

        if (checker.isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }

        sc.close();
    }
}

