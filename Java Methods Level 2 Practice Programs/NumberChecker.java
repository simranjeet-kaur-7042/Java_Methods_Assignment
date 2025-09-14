//Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less

import java.util.Scanner;
public class NumberChecker {

    public boolean isPositive(int number) {
        return number >= 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        NumberChecker checker = new NumberChecker();

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (checker.isPositive(numbers[i])) {
                if (checker.isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = checker.compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) {
            System.out.println("First number " + numbers[0] + " is greater than last number " + numbers[numbers.length - 1]);
        } else if (result == 0) {
            System.out.println("First number " + numbers[0] + " is equal to last number " + numbers[numbers.length - 1]);
        } else {
            System.out.println("First number " + numbers[0] + " is less than last number " + numbers[numbers.length - 1]);
        }

        sc.close();
    }
}
