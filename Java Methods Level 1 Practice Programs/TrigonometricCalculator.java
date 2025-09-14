//Write a program to calculate various trigonometric functions using Math class given an angle in degrees

import java.util.Scanner;

public class TrigonometricCalculator {
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        TrigonometricCalculator calculator = new TrigonometricCalculator();

        double[] results = calculator.calculateTrigonometricFunctions(angle);

        System.out.println("Sine(" + angle + ") = " + results[0]);
        System.out.println("Cosine(" + angle + ") = " + results[1]);
        System.out.println("Tangent(" + angle + ") = " + results[2]);

        sc.close();
    }
}

