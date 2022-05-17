import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class PolindromeQueue {

	public static void main(String[] args) {
		 System.out.println("Please enter a string: ");
		 Scanner in = new Scanner(System.in);
		 String inputString = in.nextLine();
		 
		 Queue queue = new LinkedList();
		 
		 for (int index = inputString.length()-1; index >=0	; index--) {
			 queue.add(inputString.charAt(index));
			 
			
		}
		 String reverseString = "";
		 while(!queue.isEmpty()) {
			 reverseString = reverseString + queue.remove();
			 
		 }
		 if(inputString.equals(reverseString)) {
			 System.out.println("The word that you entered is a polindrome! ");
		 }
		 else {
			 System.out.println("The word that you entered is not a polindrome!");
		 }

	}

}
