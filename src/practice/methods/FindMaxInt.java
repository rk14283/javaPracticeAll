package practice.methods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		
		List<String> result = new ArrayList<>();
		while (scan.hasNext()) {
			
		    result.add(scan.nextLine().trim());
		    
		   
		    
		    for (String num : result) {
		    	
		    	String[] split = num.split(" ");
		    	 
		    	int[] nums = new int[split.length];
		    	//System.out.println(split.length); 
		    	for (int i = 0; i < split.length; i++) {
		            nums[i] = Integer.parseInt(split[i]);
		            
		          
		    	}
		    	
		    
		    	System.out.println("*** Initial Array ***");
		    	System.out.println(Arrays.toString(nums));

		    	System.out.println("*** Max number in array ***");
		    	
		    	System.out.println(findMaxIntInArray(nums)); 
		    	 
		    	
		    	
		    }
		    
		    
		}
		
	
		
		
    	
    	
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		
		 // Initialize maximum element 
        int max = intArray[0]; 
        
      	// Traversing and comparing max element
        for (int i = 1; i < intArray.length; i++) {
        
         // If current element is greater than max
            if (intArray[i] > max) {
            
                // Then update max element
                max = intArray[i]; 
            }
        }
        
        return max; 
        
		
	}
	



	
	
}
