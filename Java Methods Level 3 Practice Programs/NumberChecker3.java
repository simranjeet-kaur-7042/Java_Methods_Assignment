//Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
// Hint => Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
// Method to reverse the digits array 
// Method to compare two arrays and check if they are equal
// Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed. 
// Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it


import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker3 {

    public static int countDigits(int number) {
        int count = 0;
        int n = number;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int n = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed Digits: " + Arrays.toString(reverseDigits(digits)));
        System.out.println("Is Palindrome? " + isPalindrome(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
    }
}

