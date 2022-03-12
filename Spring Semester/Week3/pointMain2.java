
public class pointMain2 {

	public static void main(String[] args) {
		
		Point2 point = new Point2();
		point.x = 3;
		point.y = 4;
		
		point.translate(2, -1);
		System.out.println("point = ("+point.x+","+point.y+")");
		point.translate(-5, -7);
		System.out.println("point = ("+point.x+","+point.y+")");
		
		System.out.println("Orijinden uzaklik = " + point.orijindenUzaklik());
		

	}

}
