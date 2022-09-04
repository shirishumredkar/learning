
public class ModulusOperator {

	public static void main(String[] args) {
		int value=1234;
		int sumdigit = 0;
		
		while(true) {
			sumdigit = sumdigit + value%10;
			value = value/10;
			
			if (value<10)
			{
				break;
			}
		}
		sumdigit = sumdigit + value;
		System.out.println("Addition of 1234+ is "+ sumdigit);
				
		
	}

}
