package practice.methods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterStringArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		
		 List<String> resultList = new ArrayList<>();
		 
		 for (String word : words) {
	            if (word.length() >= minLength && word.matches("[a-zA-Z]+")) {
	                resultList.add(word);
	            }
	        }
		 
		 // Convert List to Array
	     //   return resultList.toArray(new String[resultList.size()]);
		 //similar 
		 return resultList.toArray(new String[0]);
		 
		 

}

	
}