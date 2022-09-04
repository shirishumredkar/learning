
public class CarProp {

	public static void main(String[] args) {
		
		String output;
		Car cr = new Car();
		cr.setDoor("closed");
		cr.setSpeed(10);
		output = cr.run(cr.getDoor(),cr.getSpeed());
		System.out.println(output);
		
		Car cr1 = new Car();
		cr1.setDoor("open");
		cr1.setSpeed(10);
		output = cr1.run(cr1.getDoor(),cr1.getSpeed());
		System.out.println(output);

	}

}
