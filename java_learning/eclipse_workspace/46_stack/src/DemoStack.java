import java.util.*;
public class DemoStack {

	public static void main(String[] args) {
		
		Stack<Integer> si = new Stack<>();
		si.push(0);
		si.push(1);
		si.push(2);
		si.push(3);
		si.push(4);
		si.push(5);
		
		for (Integer sival : si)
		{
			System.out.println(sival);
		}
		
		si.pop();
		System.out.println("***************************");
		for (Integer sival : si)
		{
			System.out.println(sival);
		}
		
		System.out.println("***************************");
		System.out.println(si.peek());
		
		if(si.search(4) == 1)
		{
			System.out.println("Value is present");
		}
		else
		{
			System.out.println("Value is not present");	
		}
		
	}

}
