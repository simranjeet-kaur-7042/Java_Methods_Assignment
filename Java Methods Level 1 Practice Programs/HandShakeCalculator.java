//Create a program to find the maximum number of handshakes among N number of students.

import java.util.Scanner;
public class HandShakeCalculator{
    public static int calculateHandshakes(int n){
        return (n*(n-1))/2;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int n=sc.nextInt();

        int handshakes=calculateHandshakes(n);
        System.out.println("The maximum number of possible handshakes among "+n+" students is : "+handshakes);
        sc.close();
    }
}