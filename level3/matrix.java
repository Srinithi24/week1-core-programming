import java.util.Scanner;
import java.util.Random;
class matrix{
	public static int[][] generateMatrix(int row, int col){
		Random rand = new Random();
		int[][] mat = new int[row][col];
		for(int i = 0; i< row; i++){
			for(int j = 0; j<col; j++){
				mat[i][j] = rand.nextInt(101);
			}
		}
		return mat;
	}
	public static int[][] addMatrix(int[][] matrix1, int[][] matrix2){
		int row = matrix1.length;
		int col = matrix1[0].length;
		int[][] add = new int[row][col];
		for(int i=0; i<row;i++){
			for(int j=0; j<col;j++){
				add[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return add;
	}
	public static int[][] subMatrix(int[][] matrix1, int[][] matrix2){
		int row = matrix1.length;
		int col = matrix1[0].length;
		int[][] sub = new int[row][col];
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				sub[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		return sub;
	}
	public static int[][] mulMatrix(int[][] matrix1, int[][] matrix2){
		int row = matrix1.length;
		int col = matrix1[0].length;
		int[][] mul = new int[row][col];
		for(int i =0; i<row; i++){
			for(int j=0; j<col;j++){
				for(int k=0; k<col; k++){
					mul[i][j] += matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		return mul;
	}
	public static int[][] transposeMatrix(int[][] matrix){
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] transpose = new int[row][col];
		for(int i=0; i< row; i++){
			for(int j=0; j< col; j++){
				transpose[j][i] = matrix[i][j];
			}
		}
		return transpose;
	}
	public static int det2x2(int[][] matrix){
		if(matrix.length != 2 || matrix[0].length != 2){
			throw new IllegalArgumentException("Matrix must be 2x2.");
		}
		return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
	}
	public static int det3x3(int[][] matrix){
		if(matrix.length != 3 || matrix[0].length != 3){
			throw new IllegalArgumentException("Matrix must be 3x3.");
		}
		return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])+ matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
	}
	public static void printMatrix(int[][] matrix){
		for(int i=0; i< matrix.length; i++){
			for(int j=0; j< matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int row = scan.nextInt();
		System.out.print("Enter the number of columns:");
		int col = scan.nextInt();
		int[][] matrix1 = generateMatrix(row, col);
        int[][] matrix2 = generateMatrix(row, col);
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        System.out.println("Addition of Matrices:");
        printMatrix(addMatrix(matrix1, matrix2));
        System.out.println("Subtraction of Matrices:");
        printMatrix(subMatrix(matrix1, matrix2));
        if (row == col) { 
            System.out.println("Multiplication of Matrices:");
            printMatrix(mulMatrix(matrix1, matrix2));
        } else {
            System.out.println("Matrix multiplication not possible for non-square matrices.");
        }
        
        System.out.println("Transpose of Matrix 1:");
        printMatrix(transposeMatrix(matrix1));
        
        if (row == 2 && col == 2) {
            System.out.println("Determinant of Matrix 1 (2x2): " + det2x2(matrix1));
        } else if (row == 3 && col == 3) {
            System.out.println("Determinant of Matrix 1 (3x3): " + det3x3(matrix1));
        } else {
            System.out.println("Determinant calculation is only implemented for 2x2 and 3x3 matrices.");
        }
        
		
		scan.close();
	}
}