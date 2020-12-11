package RegularPolygon;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		regularPolygon rp1 = new regularPolygon();
		
		regularPolygon rp2 = new regularPolygon(10, 4, 5.6, 7.8);
		
		regularPolygon rp3 = new regularPolygon(6, 4);
		
		rp3.setN(6);
		rp3.setSideLength(4);
		
		System.out.println("The perimeter of rp1 is " + rp1.getPerimeter());
		System.out.println("The area of rp1 is " + rp1.getArea());

		System.out.println("The perimeter of rp2 is " + rp2.getPerimeter());
		System.out.println("The area of rp2 is " + rp2.getArea());
		
		System.out.println("The perimeter of rp3 is " + rp3.getPerimeter());
		System.out.println("The area of rp3 is " + rp3.getArea());


	}

}
