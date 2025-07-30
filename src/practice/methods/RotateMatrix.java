package practice.methods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RotateMatrix {
    
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}
	}
	
	private static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Double.valueOf(Integer.toString(i) + "." 
						+ Integer.toString(j));
			}
		}
		return matrix;
	}
	
	private static void printMatrixToConsole(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				//Print matrix to console
				//System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	private static boolean rotateMatrix(double[][] matrix, int mode) {
		switch (mode) {
			case 1:
				System.out.println("90 degrees rotated:" + System.lineSeparator());
				rotate90(matrix);
				break;
			case 2:
				System.out.println("180 degrees rotated:" + System.lineSeparator());
				rotate180(matrix);
				break;
			case 3:
				System.out.println("270 degrees rotated:" + System.lineSeparator());
				rotate270(matrix);
				break;
			default:
				System.out.println("You selected non-existing mode!");
				return false;
			}
		return true;
	}
	
	public static void rotate90(double[][] matrix) {
		
		
		double matrixValueTestSix =0.0;

		double[] mylistMain = new double[5];
		 double[] mylist = new double[4]; // initialise array to have two elements
	
		System.out.println("matrix from 90 degree method"); 	
		for (int i=0; i<matrix.length; i++) {
			
			for(int j=0; j<matrix.length; j++) {
				//Row 1
				 matrixValueTestSix =matrix[j][i];
			    
				 mylistMain[j] = matrix[j][i]; 
				
				 for(int k=0; k<(matrix.length-1); k++) {
					  mylist[k] = matrix[k][i]; 
					 
				 }
				 
			}
				  System.out.println(mylistMain[4]+"\t"+ mylist[3]+"\t"+mylist[2]+"\t"
							+mylist[1]+ "\t"+ mylist[0]);
			
		}
		
		
	}
	

	public static void rotate180(double[][] matrix) {
		
		
		double matrixValueTestSix =0.0;
		 double matrixValueTestSeven = 0.0; 
		double[] myListMain = new double[5];
		 double[] mylist = new double[6]; // initialise array to have two elements
	
		System.out.println("matrix from 180 degree method"); 	
		
		
		
		for(int l=matrix.length-1; l>=0; l--) {
			
			 
			 //System.out.println(matrix[l][4]); 
			 
			 for(int m= matrix.length-1; m>=0; m--) {
				 
				// System.out.println(matrix[l][m]); 
				 //All the elements 
				 myListMain[m] = matrix[l][m]; 
				 
				 for(int n =0; n<=(matrix.length-1); n++) {
					 
					 mylist[n] = matrix[l][n]; 
				 }
				 
			 }
			 
			 
			 
			 System.out.println(myListMain[4]+"\t"+mylist[3]+"\t"
			 +mylist[2]+"\t"+mylist[1]+"\t"+mylist[0]); 
			 
			 
			 
			
			 
		 }
		 
		
		
			 
	}

	public static void rotate270(double[][] matrix) {
		
	}

}
