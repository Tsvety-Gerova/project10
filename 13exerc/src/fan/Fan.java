package fan;

public class Fan {

	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3; 
	String mode;
	String ifSwitchedOff;
	
	private int speed = 1;
	private boolean switchedOn = false;
	private double radius = 5;
	private String color = "blue";
	
	public void setSpeed (int speed) {
		this.speed = speed;
	}
	public int GetSpeed() {
		return speed;
	}
	
	
	
	public void setMode (boolean switchedOn) {
		this.switchedOn = switchedOn;
	}
	public boolean getMode() {
		return switchedOn;
	}
	
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	
	
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	
	Fan() {		
	}
	
	public String toString() {
		if (switchedOn = true) {
			ifSwitchedOff  = "true";
		  if(speed == 1) {
			mode = "SLOW";
		}else if(speed == 2) {
			mode = "MEDIUM";
		}else if(speed == 3) {
			mode = "FAST";
		} 

	}else {
		ifSwitchedOff = "The fan is off";
		}
		return mode + " " + color + " " + ifSwitchedOff;
	}
	
}
