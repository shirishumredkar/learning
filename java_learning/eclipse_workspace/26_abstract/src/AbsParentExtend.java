public class AbsParentExtend extends AbsChild {
	
	private int age;
	
	AbsParentExtend(int age,String name)
	{
		super(name);
		this.age =age;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public int getAge() {
		return this.age;
	}
	
	

}
