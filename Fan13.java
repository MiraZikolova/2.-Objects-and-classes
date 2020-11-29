package exercise13;

public class Fan13 {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	private int speed;
	private boolean switchedOn;
	private double radius;
	private String color;
	
	public Fan13() {
		setSpeed(SLOW);
		switchedOn = false;
		setRadius(5);
		setColor("blue");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean getSwitchedOn() {
		return switchedOn;
	}
	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		if(switchedOn) {
			return "  Speed: " + speed + "\n  Color: " + color + "\n  Radius: " + radius;
		} else {
			return "  Color: " + color + "\n  Radius: " + radius + "\n  The fan is off.";
		}
	}
}