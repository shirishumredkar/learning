
public class CarRun {

	public static void main(String[] args) {
		Car cr = new Car();
		String status;
		status = cr.run(cr.getDoor(), cr.getSpeed());
		System.out.println(status);
		
		Car cr1 = new Car("closed",100);
		status = cr1.run(cr1.getDoor(), cr1.getSpeed());
		System.out.println(status);

	}

}
