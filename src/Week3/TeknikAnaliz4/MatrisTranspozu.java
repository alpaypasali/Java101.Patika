package Week3.TeknikAnaliz4;

import java.util.Random;
import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int column = scanner.nextInt();

        int[][] matrix = createMatrix(row, column);

        printMatrix(matrix);
        System.out.println("-----------------------------------------------");
        int[][] transposeMatrix = transposeMatrix(matrix);
        printMatrix(transposeMatrix);
    }
    public static int[][] createMatrix(int row, int column) {
        Random r = new Random();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = r.nextInt(10);
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transposedMatrix = new int[column][row];

        for (int i = 0 ; i <row ; i++){
            for (int j = 0; j < column; j++) {
                transposedMatrix[j][i] = matrix[i][j];

            }


        }
        return  transposedMatrix;


    }
}
