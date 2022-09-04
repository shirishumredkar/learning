
public class RunCall {

	public static void main(String[] args) {
		
		int age = 36;
		String[] name = {"Shirish"};
		RunCall rc = new RunCall();
		rc.displayAge(age,name);
		System.out.println("Value of Age in Main is "+age);
		System.out.println("Post Name inside method is "+name[0]);
		
		}
	
	public void displayAge(int age,String[] name)
	{
		System.out.println("Pre Current Age inside method is "+age);
		System.out.println("Pre Name inside method is "+name[0]);
		age = 37;
		name[0] = "Shirish Umredkar";
		System.out.println("Post Name inside method is "+name[0]);
		System.out.println("Post Current Age inside method is "+age);
	}

}
