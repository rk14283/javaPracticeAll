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
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while (scan.hasNext()) {
			
		    result.add(scan.nextLine().trim());
		    //numbers.add(Integer.parseInt(scan.nextLine().trim()));
		   
		    
		  
		    
		    for (String num : result) {
		    	System.out.println(num);
		    	String[] split = num.split(" ");
		    	int[] nums = new int[split.length];
		    	//System.out.println(split.length); 
		    	for (int i = 0; i < split.length; i++) {
		            nums[i] = Integer.parseInt(split[i]);
		            
		          
		    	}
		    	
		    	for (int integer: nums) {
		    		System.out.print(integer);
		    	}
		    	 
		    	
		    	
		    }
		    
		}
		   
				 
				 
			/*	 
		    for (String num : result) {
					  Integer neki = Integer.parseInt(num);
					  
					  numbers.add(neki); 
					  System.out.print(numbers); 
			            
			        }
				*/  
			
		
		
		
		
		/*
		
		double[] arr = Arrays.stream(scan.nextLine()
                .trim()
                .split(" "))
                .filter(x -> !x.equals(""))
                .mapToDouble(Double::parseDouble)
                .toArray();
          for(double each: arr){
        	  System.out.print(each + "  ");
        	  }
	    */
	
		System.out.println("*** Initial Array ***");
		//System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
	//	System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		return 5; 
	}
	
	
}
