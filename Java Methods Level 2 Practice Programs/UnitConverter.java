//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. 


import java.util.Scanner;

public class UnitConverter {
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Choose a conversion (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = sc.nextDouble();

        double result = 0;
        switch (choice) {
            case 1:
                result = convertKmToMiles(value);
                System.out.println(value + " km = " + result + " miles");
                break;
            case 2:
                result = convertMilesToKm(value);
                System.out.println(value + " miles = " + result + " km");
                break;
            case 3:
                result = convertMetersToFeet(value);
                System.out.println(value + " meters = " + result + " feet");
                break;
            case 4:
                result = convertFeetToMeters(value);
                System.out.println(value + " feet = " + result + " meters");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
