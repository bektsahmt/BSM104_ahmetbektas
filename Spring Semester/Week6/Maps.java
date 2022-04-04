import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;


public class Maps {

	public static void main(String[] args) {
		
		Map<Integer, String> cities = new TreeMap<>();
		
		cities.put(34, "Istanbul");
		cities.put(6, "Ankara");
		cities.put(35, "Izmir");
		cities.put(55, "Samsun");
		
		System.out.println(cities);
		System.out.println("Indexes - keys " +cities.keySet());
		System.out.println(cities.values());
		System.out.println(cities.get(55));
		
		Map<Integer, Set<String>> cities2 = new HashMap<>();
		cities2.put(34, new TreeSet<String>());
		cities2.get(34).add("Istanbul");
		cities2.get(34).add("Besiktas");
		cities2.get(34).add("Eminonu");
		cities2.put(6, new TreeSet<String>());
		cities2.get(6).add("Ankara");
		cities2.get(6).add("Cankaya");
		System.out.println(cities2);
		
		
		
		
		
		

	}

}
