
public class Point3 {
	int x ;
	int y;
	
	public Point3(int luci, int elfo) {
		this.x = luci;
		this.y = elfo;
	}

	public double orijindenUzaklik() {
	return Math.sqrt(x*x + y*y);
	
	
	}
	 public void translate(int dx, int dy) {
    	 x +=dx;
    	 y +=dy;
	 }
}
