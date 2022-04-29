import java.util.Stack;
public class ValidParantheses {

	public static boolean validParantheses(String str) {
		Stack<Character> s = new Stack<>();
		
		for(char x: str.toCharArray()) {
			if(x=='{' || x=='[' || x=='(') {
				s.push(x);
				
			}
			else if(!s.isEmpty() && ( x==']' && s.peek()=='[' ||  x=='}' && s.peek()=='{' ||  x==')' && s.peek()=='(')) {
			 s.pop();
				   
			}
			else {
				return false;
			}
		}
		return s.isEmpty();
		

	}

}
