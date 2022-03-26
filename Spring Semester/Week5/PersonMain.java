import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		
		ArrayList<Person> members = new ArrayList<>();
		
		members.add(new Person("Ahmet" , 24));
		members.add(new Person("Kaya" , 30));
		members.add(new Person("Gorkem" , 40));
		
		members.forEach(member ->{
			System.out.println("Name: " +member.getName()+", Age: " +member.getAge());
		});
		
		System.out.println();
		for(Person member: members) {
			System.out.println("Name: " +member.getName()+", Age: " +member.getAge());
			
		}
		
		

	}

}
