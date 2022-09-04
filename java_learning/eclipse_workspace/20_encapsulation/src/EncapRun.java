
public class EncapRun {

	public static void main(String[] args) {
		
		Encap en = new Encap("Shirish",36);
		System.out.println("Name : "+en.getName());
		System.out.println("Age :  "+en.getAge());
		en.setName("Shirish Umredkar");
		en.setAge(37);
		System.out.println("Full Name : "+en.getName());
		System.out.println("New Age :  "+en.getAge());
		

	}

}
