
public class ScopeDemo {

	int j=0;
	public static void main(String[] args) {
	
	int i=0;
	ScopeDemo sd = new  ScopeDemo();
	for (;i<=10;i++)
	{
	 
     System.out.println(i);
	 System.out.println(sd.j);
	 sd.j++;
	}
	System.out.println(i);
	System.out.println(sd.j);
}
}
// Scope of Variable is within {}
