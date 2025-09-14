//Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
// Hint => Write a method to Generate a 6-digit OTP number using Math.random() 
// Create an array to save the OTP numbers generated 10 times
// Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false


import java.util.Arrays;
public class OTPGenerator {

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000; 
    }

    public static boolean areUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + areUnique(otps));
    }
}
