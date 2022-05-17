import java.util.*;
public class PolindromeString {

	public static void main(String[] args) {
		System.out.println("Please enter a string: ");
		 Scanner in = new Scanner(System.in);
		 String inputString = in.nextLine();
		 String reverseString= "";
		 
		 int length = inputString.length();
		 
		 for(int index= length-1; index >= 0; index--) {
			 reverseString = reverseString + inputString.charAt(index);
			 
		 }
		 if(inputString.equals(reverseString)) {
			 System.out.println("The word that you entered is a polindrome! ");
		 }
		 else {
			 System.out.println("The word that you entered is not a polindrome!");
		 }

	}

}
