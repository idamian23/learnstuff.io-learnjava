package assignment1.utils;


import java.util.Random;
import java.util.Scanner ;

public class Generator {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static int[] generateArrayManual(int length){

        int[] array = new int[length];

        System.out.println("Please insert your numbers : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();}
        return array;
    }

    public static int[] generateRandomArray(int length){
        int[] array = new int[length];

        System.out.println("Please insert your numbers : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);}
        return array;
    }


    public static int[][] generateMatrixManual(int rows, int columns){

        int[][] matrix = new int[rows][columns];
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter the elements for the matrix: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] generateRandomMatrix(int rows, int columns){
        int[][] matrix = new int[rows][columns];
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        return matrix;
    }

}
