// 8. Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month.
/* a. Write a Method to get the name of the month. For this define a month Array to store the names of the months
b. Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
c. Write a method to get the first day of the month using the Gregorian calendar algorithm
    y0 = y − (14 − m) / 12
    x = y0 + y0/4 − y0/100 + y0/400
    m0 = m + 12 × ((14 − m) / 12) − 2
    d0 = (d + x + 31m0 / 12) mod 7
d. Displaying the Calendar requires 2 for loops. 
    i. The first for loop up to the first day to get the proper indentation. As in the example above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
    ii. The Second for loop Displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sat
 */


import java.util.Scanner;
public class Calendar {
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] days = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getFirstDay(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31*m0)/12) % 7;
        return d0; 
    }

    public static void printCalendar(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            days[2] = 29;
        } else {
            days[2] = 28; 
        }

        System.out.println("     " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(1, month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int dayNum = 1; dayNum <= days[month]; dayNum++) {
            System.out.printf("%4d", dayNum);
            if (((dayNum + firstDay) % 7 == 0) || (dayNum == days[month])) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}