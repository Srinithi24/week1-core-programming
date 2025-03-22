import java.util.Scanner;

class multiDimension {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = scan.nextInt();
        System.out.print("Enter columns: ");
        int columns = scan.nextInt();
        int[][] matrix = new int[rows][columns]; 
        int[] array = new int[rows * columns];   
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scan.nextInt();
                array[index++] = matrix[i][j]; 
            }
        }
        System.out.println("2D Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        scan.close();
    }
}
