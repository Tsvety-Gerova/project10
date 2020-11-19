package RegularPolygon;

public class regularPolygon {

	private int n = 3; // strani na mnogougulnika
	private double sideLength = 1;
	private double x = 0; // x-koordinata na centura
	private double y = 0; // y-koordinatata na centura
	
	public void setN(int n) {
		this.n = n;
	}
	public int getN() {
		return n;
	}
	
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	public double getSideLength() {
		return sideLength;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public double getY() {
		return y;
	}
	
	public double getPerimeter(int n, double sideLength) {
		this.n = n;
		this.sideLength = sideLength;
		return n*sideLength;
	}
	
	public double getArea(int n, double sideLength) {
		this.n = n;
		this.sideLength = sideLength;
		return (n*sideLength*sideLength)/(4.0*Math.tan(Math.PI/n));
	}
	
	regularPolygon(){	
	}
	
	regularPolygon(int n, double sideLength){
		this.n = n;
		this.sideLength = sideLength;
		x = 0;
		y = 0;
	}
	
	regularPolygon(int n, double sideLength, double x, double y){
		this.n = n;
		this.sideLength = sideLength;
		this.x = x;
		this.y = y;
	}
}
