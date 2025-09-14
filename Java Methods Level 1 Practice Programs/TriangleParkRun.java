//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete


import java.util.Scanner;
public class TriangleParkRun{
    public static double calculateRounds(double side1,double side2,double side3,double distance){
        double perimeter=side1+side2+side3;
        return distance/perimeter;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side 1 of triangle(in meters):");
        double side1=sc.nextDouble();

        System.out.print("Enter side 2 of triangle(in meters):");
        double side2=sc.nextDouble();

        System.out.print("Enter side 3 of triangle(in meters):");
        double side3=sc.nextDouble();

        double distance=5000;
        double rounds=calculateRounds(side1,side2,side3,distance);

        System.out.println("The athlete must complete " + Math.ceil(rounds) 
                           + " rounds to cover 5 km.");

                           sc.close();


    }

}