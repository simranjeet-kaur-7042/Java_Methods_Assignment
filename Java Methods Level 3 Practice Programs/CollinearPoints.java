//Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 
// Hint => Take inputs for 3 points x1, y1, x2, y2, and x3, y3
// Write a Method to find the 3 points that are collinear using the slope formula. 
// The method to find the three points is collinear using the area of the triangle formula.



public class CollinearPoints {
    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        System.out.println("Points: A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");

        if (checkCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using slope method: Points are collinear.");
        } else {
            System.out.println("Using slope method: Points are NOT collinear.");
        }

        if (checkCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Using area method: Points are collinear.");
        } else {
            System.out.println("Using area method: Points are NOT collinear.");
        }
    }
}

