import java.util.ArrayList;
public class StarAdd {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("pencil");
		words.add("computer");
		words.add("bartin");
		words.add("book");
		System.out.println("Before loop : " +words);
		System.out.println("Length of list : " +words.size());
		
		for (int index = 0; index < words.size(); index+=2) {
			words.add(index , "*");
				
		}
		System.out.println("After loop : " +words);
		System.out.println("Length of list : " +words.size());
		
		for (int index = 0; index < words.size(); index++) {
			words.remove(index);			
		}
        /* for(int index=0 ; index < words.size(); index-=2){
          words.remove(index);
          }
         */
		System.out.println("After deleting process: " +words);
		System.out.println("Length of deleted list: " +words.size());
	}

}
