//Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it

import java.util.Scanner;
public class FriendsComparison {

    public String findYoungest(String[] names, int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex];
    }

    public String findTallest(String[] names, double[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return names[maxHeightIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextDouble();
        }

        FriendsComparison comparison = new FriendsComparison();

        String youngest = comparison.findYoungest(names, ages);
        String tallest = comparison.findTallest(names, heights);

        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}
