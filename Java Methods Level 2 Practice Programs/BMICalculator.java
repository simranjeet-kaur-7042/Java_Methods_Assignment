//An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

import java.util.Scanner;

public class BMICalculator {

    public double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; 
        return weight / (heightM * heightM);
    }

    public String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3];  
        String[] statuses = new String[10];

        BMICalculator calculator = new BMICalculator();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of member " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();

            members[i][2] = calculator.calculateBMI(members[i][0], members[i][1]);
            statuses[i] = calculator.getBMIStatus(members[i][2]);
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1) + 
                               " | Weight: " + members[i][0] + " kg" +
                               " | Height: " + members[i][1] + " cm" +
                               " | BMI: " + String.format("%.2f", members[i][2]) +
                               " | Status: " + statuses[i]);
        }

        sc.close();
    }
}

