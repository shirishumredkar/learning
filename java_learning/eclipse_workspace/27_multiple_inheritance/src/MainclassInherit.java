
public class MainclassInherit {

	public static void main(String[] args) {
		 
		String name;
		int    age;
		AbsInher absin = new AbsInher();
		
		absin.setName("Shirish");
		absin.setAge(36);
		
		name = absin.getName();
		age = absin.getAge();
		
		System.out.println(name);
		System.out.println(age);
	}

}
