package practice.methods;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AmountOfWords {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	
	//	ArrayList<String> result = new ArrayList<String>();
		
	//	result.add(sc.nextLine().trim());
	
	String userInput = sc.nextLine().trim();
	
	// Split the input by punctuation and whitespace
    String[] words = userInput.split("[\\p{P}\\s]+");

    
 // Filter out words that contain only letters
    int count = 0;
    for (String word : words) {
        if (word.matches("[a-zA-Z]+")) {  // Only count words with letters
            count++;
        }
    }

    System.out.println(count);
		

		
	
		
		
		
	}

	public static int getWordsAmount(String text) {
		
		//return text.replaceAll("\\s+","").length();
		
		return text.length(); 
	}

	
	

}
