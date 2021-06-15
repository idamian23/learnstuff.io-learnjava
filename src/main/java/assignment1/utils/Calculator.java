package assignment1.utils;


public class Calculator {

    public static void addMatrices(int[][] first, int[][] second){
        int row = first.length;
        int column = first[0].length;
        int[][] sum = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println("Sum of Matrices: ");
        Printer.printMatrix(sum);
    }

    public static void multipleMatrices(int[][]first, int[][] second){
        int row = first.length;
        int column = first[0].length;
        int[][] product = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                product[i][j] = first[i][j] * second[i][j];
            }
        }

        System.out.println("Product of Matrices: ");
        Printer.printMatrix(product);
    }

    public static void scalarMatrices(int scalar, int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] scalarResult = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                scalarResult[i][j] = scalar * matrix[i][j];
            }
        }

        System.out.println("Scalar  of the matrix: ");
        Printer.printMatrix(scalarResult);
    }


}