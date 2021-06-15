package assignment1.exercises;


import assignment1.utils.Calculator;
import assignment1.utils.Generator;

import java.util.Random ;
import java.util.Scanner;

public class Exercise4 {

    //For two given matrices implement: matrix addition, matrix scalar multiplication and matrix
    //multiplication


    public static void main(String[] arg){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rows = random.nextInt(10);
        int columns = random.nextInt(10);
        int[][] matrix1 = Generator.generateRandomMatrix(rows,columns);
        int[][] matrix2 = Generator.generateRandomMatrix(rows,columns);

        /**************************
         Printer.printMatrix(matrix1);
         System.out.println("---------");
         Printer.printMatrix(matrix2);
         System.out.println("---------");
         ****************************/

        Calculator.addMatrices(matrix1,matrix2);
        System.out.println("---------------------");
        Calculator.multipleMatrices(matrix1,matrix2);
        System.out.println("---------------------");

        //TODO - take input for scalar
        Calculator.scalarMatrices(1,matrix2);
    }


}