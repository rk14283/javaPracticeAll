package practice.methods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class EmptyRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);

		
	}
	
	public static void drawRectangle(int height, int width) {
	//System.out.println(height); 
	
		 int i, j;
	        
	        // outer loop to handle number of rows
	        for (i = 0; i < height; i++) {
	            
	            //  inner loop to handle number of columns
	            for (j = 0; j < width; j++) {
	                
	                // star will print only when  it is in first
	                // row or last row or first column or last
	                // column
	                if (i == 0 || j == 0 || i == height - 1
	                    || j == width - 1) {
	                    System.out.print("*");
	                    
	                }
	                
	                // otherwise print space only
	                else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }

	 
	
	
	
	}

