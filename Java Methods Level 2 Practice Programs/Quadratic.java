//Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()


import java.util.Scanner;

public class Quadratic {
    public double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{}; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        Quadratic quadratic = new Quadratic();
        double[] roots = quadratic.findRoots(a, b, c);

        if (roots.length == 2) {
            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("No real roots.");
        }

        sc.close();
    }
}

