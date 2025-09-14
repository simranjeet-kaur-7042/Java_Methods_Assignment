//Write a program to find the sum of n natural numbers using loop

import java.util.Scanner;
public class SumOfNaturalNumber {
    public int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        SumOfNaturalNumber obj = new SumOfNaturalNumber();

        int result = obj.findSum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + result);
        sc.close();
    }
}
