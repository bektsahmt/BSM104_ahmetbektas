import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

public class Sets {

	public static void main(String[] args) {
		ArrayList<String> lists = new ArrayList<>();
		lists.add("pencil");
		lists.add("desk");
		lists.add("computer");
		lists.add("notebook");
		lists.add(3,"wardrobe");
		lists.add("pencil");
		lists.add("desk");
		System.out.println(lists);
		
		Set<String> sets = new HashSet<String>();
		
		sets.add("pencil");
		sets.add("desk");
		sets.add("computer");
		sets.add("notebook");
		sets.add("pencil");
		sets.add("desk");
		
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("wardrobe"));
		
		sets.clear();
		System.out.println(sets);
		sets.addAll(lists);
		
		System.out.println(sets);
		System.out.println(lists.get(2));
		
		

	}

}
