
public class Switch {

	public static void main(String[] args) {
	 
		int x = 3;
		char c = 'A';
		String s = "Shirish";
		
		switch(x) {
		case 1:
			System.out.println("Value of x is 1");
			break;
		case 2:
			System.out.println("Value of x is 2");
			break;	
		case 3:
			System.out.println("Value of x is 3");
			System.out.println("Break");
			break;	
		default:
			System.out.println("Value of x is not 1,2,3");
			break;	
		}
		
		switch(c) {
		case 'a':
		case 'A':	
			System.out.println("Value of c is a or A");
			break;
		case 'b':
		case 'B':
			System.out.println("Value of c is b or B");
			break;	
		case 'c':
		case 'C':
			System.out.println("Value of c is C or c");
			break;	
		default:
			System.out.println("Value of c is not any of Above");
			break;	
		}

		
		switch(s.toLowerCase()) {
		case "shirish":
			System.out.println("My Name is Shirish");
			break;
		case "shashi":
			System.out.println("My Name is Shashi");
			break;
		default:
			System.out.println("No Name");
			break;	
		}

		

	}

}
