// Create a program to find the shortest, tallest, and mean height of players present in a football team.
// Hint => 
// The formula to calculate the mean is: mean = sum of all elements/number of elements
// Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
// Write the method to Find the sum of all the elements present in the array.
// Write the method to find the mean height of the players on the football team
// Write the method to find the shortest height of the players on the football team 
// Write the method to find the tallest height of the players on the football team
// Finally display the results



import java.util.Random;
import java.util.Arrays;

public class FootballTeamHeights {
    public int findSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }
        return min;
    }

    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];
        FootballTeamHeights stats = new FootballTeamHeights();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; 
        }

        System.out.println("Heights of players: " + Arrays.toString(heights));
        System.out.println("Shortest Height: " + stats.findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + stats.findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", stats.findMean(heights));
    }
}
