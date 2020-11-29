package exercise13;

public class FanTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan13 fan1 = new Fan13();
		fan1.setSpeed(Fan13.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setSwitchedOn(true);
		System.out.println("First fan:");
		System.out.println(fan1.toString());
	
		
		Fan13 fan2 = new Fan13();
		fan2.setSpeed(Fan13.MEDIUM);

		System.out.println("Second fan:");
		System.out.println(fan2.toString());
	
		
	}

}
