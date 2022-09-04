
public class AbsMain {

	public static void main(String[] args) {
		
		String name;
		int    age;
		AbsParentExtend ape = new AbsParentExtend(36,"Shirish");
		
		name=ape.getName();
		age=ape.getAge();
		
		System.out.println(name);
		System.out.println(age);

	}

}
