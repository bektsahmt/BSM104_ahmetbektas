import java.util.Queue;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
	
		int data[] = {18,4,3,9,4,2};
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int num : data)
			q.add(num);
		
		System.out.println("Queue = " +q);
		
		removeAll(q,4);
		
		System.out.println("Queue = " +q);

	}
    public static void removeAll(Queue<Integer> q, int value ) { 
    	
    	int size = q.size();
    	for (int i = 0; i < size; i++) {
    		int number = q.remove();
    		
    		if(number != value) {
    			q.add(number);
    		}
    		
    		
			
		}
    	
    	
    }
  }
