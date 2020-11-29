package exercise13;

public class RegularPolygonTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon13 p1 = new RegularPolygon13();
		
		System.out.println("The perimeter is " + p1.getPerimeter());
		System.out.println("The area is " + p1.getArea());
		
		RegularPolygon13 p2 = new RegularPolygon13(10, 4, 5.6, 7.8);
	
		System.out.println("The perimeter is " + p2.getPerimeter());
		System.out.println("The area is " + p2.getArea());
		
		RegularPolygon13 p3 = new RegularPolygon13(6, 4);

		System.out.println("The perimeter is " + p3.getPerimeter());
		System.out.println("The area is " + p3.getArea());
	}

}
