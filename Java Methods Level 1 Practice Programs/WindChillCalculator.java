//Write a program calculate the wind chill temperature given the temperature and wind speed

import java.util.Scanner;

public class WindChillCalculator {
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 
             + (0.6215 * temperature) 
             + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

        WindChillCalculator calculator = new WindChillCalculator();

        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.println("The wind chill temperature is: " + windChill);

        sc.close();
    }
}
