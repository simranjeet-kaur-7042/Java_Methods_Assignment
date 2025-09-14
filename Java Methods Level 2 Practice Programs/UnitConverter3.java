//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. 

public class UnitConverter3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 5;
        double liters = 10;

        System.out.println(fahrenheit + " °F = " + convertFahrenheitToCelsius(fahrenheit) + " °C");
        System.out.println(celsius + " °C = " + convertCelsiusToFahrenheit(celsius) + " °F");
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kg");
        System.out.println(kilograms + " kg = " + convertKilogramsToPounds(kilograms) + " pounds");
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
