package io.learnstuff.assignment1.exercises;


import io.learnstuff.assignment1.utils.Generator;
import io.learnstuff.assignment1.utils.Printer;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] arg) {

        // Read an array and a matrix from the keyboard
        // (requires the use of Scanner)



        Scanner scanner = new Scanner(System.in);


        //int[][] matrix = new int[rows][columns];
        System.out.println("What do you need for today: ? \n 1 - Array \n 2 - Matrix");
        System.out.println("Please choose : ");

        boolean valid = false;
        int choice = 0;

        while (!valid) {
            choice = scanner.nextInt();

            if (choice == 1 || choice == 2) {
                valid = true;
            } else {
                System.out.println("Invalid input! Please choose between 1 or 2 :");
            }
        }

        if (choice == 1/*array*/ ) {

            System.out.println("Please enter you array's length : ");
            int length = scanner.nextInt();

            int[] array = Generator.generateArrayManual(length);
            Printer.printArray(array);
        }
        else if(choice == 2/*matrix*/){
            System.out.println("Enter number of rows for the matrix: ");
            int rows = scanner.nextInt();
            System.out.println("Enter number of columns for the matrix: ");
            int columns = scanner.nextInt();

            int[][] matrix = Generator.generateMatrixManual(rows,columns);
            Printer.printMatrix(matrix);
        }
    }

}


