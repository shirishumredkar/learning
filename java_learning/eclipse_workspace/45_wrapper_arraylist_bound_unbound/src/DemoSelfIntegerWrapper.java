import java.util.*;

class IntWrapper
{
	public int numv;
	public IntWrapper(int numv)
	{
		this.numv =numv;
	}
}

public class DemoSelfIntegerWrapper {

	public static void main(String[] args) {
		
		ArrayList<IntWrapper> al = new ArrayList<>();
		al.add(new IntWrapper(10));
		System.out.println(al.get(0).numv);
		al.add(new IntWrapper(20));
		System.out.println(al.get(1).numv);
	}

}
