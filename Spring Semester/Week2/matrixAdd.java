
public class matrixAdd {

	public static void main(String[] args) {
		int[][] array1 = {{1,2,3},{3,2,3},{5,4,3}};
	    int[][] array2 = {{1,2,3},{2,2,2},{3,2,1}};
	    
	    int[][] three = matrixAdd(array1,array2);
	    
	for (int first = 0; first < three.length; first++) {
		for (int second = 0; second < three[first].length; second++) {
			System.out.print(three[first] [second]+"");
			
		}
		System.out.println();
	}

	}
    public static int[][] matrixAdd(int[][] one, int[][] two ){
    	int[][] three = new int[one.length][one[0].length];
    	
    	for (int first = 0; first < one.length; first++) {
    		for (int second = 0; second < one.length; second++) {
    			three[first][second] = one[first][second] + two[first][second];
    			
				
			}
			
		}
    	return three;
    }
}
