import java.util.Queue;
import java.util.LinkedList;

public class Stutter {

	public static void main(String[] args) {
		
		int data[]= {3,4,8,9,1};
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int number : data)
			q.add(number);
				System.out.println(q);
				
				stutter(q);
				System.out.println(q);
	}
	
	public static void stutter(Queue<Integer> q) {
		
		int size = q.size();
		while(size>0) {
			int temp = q.remove();
			q.add(temp);
			q.add(temp);
			size--;
			
		}
	}

}
