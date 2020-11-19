package RegularPolygon;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		regularPolygon rp1 = new regularPolygon();
		
		regularPolygon rp2 = new regularPolygon();
		
		rp2.setN(10);
		rp2.setSideLength(4);
		rp2.setX(5.6);
		rp2.setY(7.8);
		
		regularPolygon rp3 = new regularPolygon();
		
		rp3.setN(6);
		rp3.setSideLength(4);
		
		System.out.println("The perimeter of rp1 is " + rp1.getPerimeter(6,4));
		System.out.println("The area of rp1 is " + rp1.getArea(6,4));

		System.out.println("The perimeter of rp2 is " + rp2.getPerimeter(10,4));
		System.out.println("The area of rp2 is " + rp2.getArea(10,4));
		
		System.out.println("The perimeter of rp3 is " + rp3.getPerimeter(6,4));
		System.out.println("The area of rp3 is " + rp3.getArea(6,4));


	}

}
