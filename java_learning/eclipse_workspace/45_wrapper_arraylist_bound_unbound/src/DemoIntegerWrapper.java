import java.util.*;

public class DemoIntegerWrapper {

	ArrayList<Integer> ali = new ArrayList<>();
	
	public void addElement(int val)
	{
		ali.add(val);
	}
	
	public void getElement(int pos)
	{
		System.out.println(ali.get(pos));
	}
	
	
	public static void main(String[] args) {
		
		// Integer wrapper Class by Default
		DemoIntegerWrapper diw = new DemoIntegerWrapper();
		diw.addElement(1);
		diw.addElement(2);
		diw.getElement(0);
		diw.getElement(1);
	}

}
