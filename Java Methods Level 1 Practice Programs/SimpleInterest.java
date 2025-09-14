//Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount : ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of Interest : ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = sc.nextDouble();

        double SimpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + SimpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        sc.close();

    }
}