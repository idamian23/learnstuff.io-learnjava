package assignment1.exercises;




import assignment1.utils.Generator;
import assignment1.utils.Printer;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

    //Use the Random class to generate elements for a matrix for which you read the rows and
    //columns from the keyboard

    public static void main(String[] arg){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows for the matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns for the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = Generator.generateRandomMatrix(rows,columns);
        Printer.printMatrix(matrix);
    }
}