package telran50.arrays;

///////////////Class work 04
public class MatricesInt {
		public static int[][] multiplyConstant(int[][] matrix, int constant) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] *= constant;
				}
			}
			return matrix;
		}
		//////////////////  HW 04
		
		
		public static int[] getColumn(int[][] matrix, int column) {
			int arColumn [] ;
			arColumn= new int [matrix.length];
			for (int row = 0; row < matrix.length; row++) {					
					arColumn[row]=matrix[row][column];
				}
			return arColumn;
		}
		
		
		public static int[][] transpMatrix (int[][] matrix) {
			int rows= matrix.length;
			int columns=matrix[0].length;
			int trRows=columns;
			int trColumns=rows;
			int trMatrix[][];
			trMatrix=new int[trRows][trColumns];
			for (int row = 0; row < rows; row++) {
				for (int column = 0; column < columns; column++) {	
					trMatrix[column][row] = matrix[row][column];
				}
					
			}
			return trMatrix;
		}
		
}
