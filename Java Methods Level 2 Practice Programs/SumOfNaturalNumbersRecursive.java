//Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct. 

import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + sumRecursive(n - 1); 
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number. Exiting program.");
            return;
        }

        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);

        System.out.println("Sum using recursion = " + sumRec);
        System.out.println("Sum using formula   = " + sumForm);

        if (sumRec == sumForm) {
            System.out.println("Both methods give the same result!");
        } else {
            System.out.println("Results do not match!");
        }

        sc.close();
    }
}
