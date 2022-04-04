import java.io.File;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Sets2 {

	public static void main(String[] args)  throws FileNotFoundException {
		
		 Set<String> words = new HashSet<String>();
		 
		 words = read();
		 System.out.println(words);
		 
		 for(String word : words) //words.addAll(read());
			 words.add(word);
		 
		 System.out.println(words);
		

	}
	
	public static Set<String> read() throws FileNotFoundException{
		System.out.println("What's the name of file that you want to read ? : ");
		Scanner input= new Scanner(System.in);
		
		String file = input.next();
		Scanner in = new Scanner(new File(file));
		
		Set<String> temp = new HashSet<>();
		
		while(in.hasNext()) {
			String word = in.nextLine().toLowerCase();
			temp.add(word);
			
		}
		return temp;
	}

}
