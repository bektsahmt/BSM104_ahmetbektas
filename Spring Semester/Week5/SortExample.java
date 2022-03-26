import java.util.*;
public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("pencil");
		words.add("computer");
		words.add("bartin");
		words.add("book");
		
		System.out.println("Before sorting : " +words);
		System.out.println(words.get(0));
		Collections.sort(words);
		System.out.println("After sorting : " +words);
	}

}
