import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		System.out.println("What is Your Name ?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("What is Your Age ?");
		int age = sc.nextInt();
		System.out.println("My Name is "+name);
		System.out.println("My Age is "+age);
		
		
		

	}

}
