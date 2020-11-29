package exercise13;

public class RegularPolygon13 {
	private int n;
	private double sideLength;
	private double x;
	private double y;
	
	 public RegularPolygon13(){
		setN(3);
		setSideLength(1);
		setX(0);
		setY(0);
	}
	public RegularPolygon13(int aN, double aSideLength){
		setN(aN);
		setSideLength(aSideLength);
	}
	public RegularPolygon13(int aN, double aSideLength, double x, double y){
		setN(aN);
		setSideLength(aSideLength);
		setX(x);
		setY(y);
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSideLength() {
		return sideLength;
	}
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public double getPerimeter() {
		return (n * sideLength);
	}
	public double getArea() {
		return ((n * sideLength * sideLength) / (4 * Math.tan(Math.PI / n)));
	}
}