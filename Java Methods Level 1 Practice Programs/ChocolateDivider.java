//Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates

import java.util.Scanner;

public class ChocolateDivider {
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int quotient = numberOfChocolates / numberOfChildren;   
        int remainder = numberOfChocolates % numberOfChildren;  
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int children = sc.nextInt();

        if (children == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);

            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}

