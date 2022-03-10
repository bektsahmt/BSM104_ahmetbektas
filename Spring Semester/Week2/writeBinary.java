
public class writeBinary {

	public static void main(String[] args) {
		writeBinary(356);

	}
    public static void writeBinary(int number) {
    	if(number<0)
    		throw new IllegalArgumentException();
    	if(number>=2)
    		writeBinary(number/2);
    	System.out.print(number%2);
    }
}
