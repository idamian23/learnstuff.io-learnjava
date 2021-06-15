package assignment1.utils;

public class Printer {
    public static void printMatrix( int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray(int[] array){
        System.out.println("Your array has : ");
        System.out.print("[ ");
        for (int element : array) {
            System.out.print(element + " "); }
        System.out.print("]\n");
    }
}