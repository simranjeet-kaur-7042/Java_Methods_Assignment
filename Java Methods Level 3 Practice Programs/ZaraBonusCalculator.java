//Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
// Hint => Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
// Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
// Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
// Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format


import java.util.Random;

public class ZaraBonusCalculator {

    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        Random rand = new Random();
        for (int i = 0; i < numEmployees; i++) {
            int salary = 10000 + rand.nextInt(90000);
            int years = 1 + rand.nextInt(15);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateNewSalaryAndBonus(int[][] employeeData) {
        int numEmployees = employeeData.length;
        double[][] newData = new double[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? 0.05 * oldSalary : 0.02 * oldSalary;
            double newSalary = oldSalary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    public static void displayTable(int[][] employeeData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee  OldSalary  Years  Bonus  NewSalary");
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println((i + 1) + "         " + (int)oldSalary + "      " + years + "     " + (int)bonus + "    " + (int)newSalary);
        }

        System.out.println("Total     " + (int)totalOldSalary + "            " + (int)totalBonus + "    " + (int)totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] employeeData = generateEmployeeData(numEmployees);
        double[][] newData = calculateNewSalaryAndBonus(employeeData);
        displayTable(employeeData, newData);
    }
}
