//Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.
// Hint => Write a Method to create a random matrix taking rows and columns as parameters
// Write a Method to add two matrices
// Write a Method to subtract two matrices
// Write a Method to multiply two matrices
// Write a Method to find the transpose of a matrix
// Write a Method to find the determinant of a 2x2 matrix
// Write a Method to find the determinant of a 3x3 matrix
// Write a Method to find the inverse of a 2x2 matrix
// Write a Method to find the inverse of a 3x3 matrix
// Write a Method to display a matrix


import java.util.Random;
public class MatrixOperations {

    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = rand.nextInt(10); 
        return matrix;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int n = B.length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[j][i] = A[i][j];
        return result;
    }

    public static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    public static int determinant3x3(int[][] A) {
        return A[0][0]*(A[1][1]*A[2][2]-A[1][2]*A[2][1])
             - A[0][1]*(A[1][0]*A[2][2]-A[1][2]*A[2][0])
             + A[0][2]*(A[1][0]*A[2][1]-A[1][1]*A[2][0]);
    }

    public static double[][] inverse2x2(int[][] A) {
        double det = determinant2x2(A);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / det;
        inv[0][1] = -A[0][1] / det;
        inv[1][0] = -A[1][0] / det;
        inv[1][1] = A[0][0] / det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] A) {
        double det = determinant3x3(A);
        if (det == 0) return null;
        double[][] inv = new double[3][3];
        inv[0][0] = (A[1][1]*A[2][2]-A[1][2]*A[2][1])/det;
        inv[0][1] = -(A[0][1]*A[2][2]-A[0][2]*A[2][1])/det;
        inv[0][2] = (A[0][1]*A[1][2]-A[0][2]*A[1][1])/det;

        inv[1][0] = -(A[1][0]*A[2][2]-A[1][2]*A[2][0])/det;
        inv[1][1] = (A[0][0]*A[2][2]-A[0][2]*A[2][0])/det;
        inv[1][2] = -(A[0][0]*A[1][2]-A[0][2]*A[1][0])/det;

        inv[2][0] = (A[1][0]*A[2][1]-A[1][1]*A[2][0])/det;
        inv[2][1] = -(A[0][0]*A[2][1]-A[0][1]*A[2][0])/det;
        inv[2][2] = (A[0][0]*A[1][1]-A[0][1]*A[1][0])/det;
        return inv;
    }

    public static void displayMatrix(int[][] A) {
        for (int[] row : A) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
        System.out.println();
    }

    public static void displayMatrix(double[][] A) {
        for (double[] row : A) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] A2 = createRandomMatrix(2, 2);
        int[][] B2 = createRandomMatrix(2, 2);

        System.out.println("Matrix A (2x2):");
        displayMatrix(A2);
        System.out.println("Matrix B (2x2):");
        displayMatrix(B2);

        System.out.println("A + B:");
        displayMatrix(addMatrices(A2, B2));
        System.out.println("A - B:");
        displayMatrix(subtractMatrices(A2, B2));
        System.out.println("A * B:");
        displayMatrix(multiplyMatrices(A2, B2));
        System.out.println("Transpose of A:");
        displayMatrix(transposeMatrix(A2));

        System.out.println("Determinant of A: " + determinant2x2(A2));
        System.out.println("Inverse of A:");
        double[][] invA2 = inverse2x2(A2);
        if (invA2 != null) displayMatrix(invA2); else System.out.println("No inverse exists.\n");

        int[][] A3 = createRandomMatrix(3, 3);
        System.out.println("Matrix A (3x3):");
        displayMatrix(A3);

        System.out.println("Determinant of A3: " + determinant3x3(A3));
        System.out.println("Inverse of A3:");
        double[][] invA3 = inverse3x3(A3);
        if (invA3 != null) displayMatrix(invA3); else System.out.println("No inverse exists.\n");
    }
}
