
public class Point2 {
	
	int x;
	int y;
	
	public double orijindenUzaklik() {
		return Math.sqrt(x*x + y*y);
		
	}
     public void translate(int dx, int dy) {
    	 x +=dx;
    	 y +=dy;
    	
     }
}
