import java.util.*;
public class DemoLinkedList {
	
	public static void main(String args[])
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(0);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		for(Integer val:ll)
		{
			System.out.println(val);
		}
		
		System.out.println("**********************************");
		
		ll.remove(2);
		for(Integer val:ll)
		{
			System.out.println(val);
		}
		
		System.out.println("**********************************");
		
		ll.set(2, 9);
		for(Integer val:ll)
		{
			System.out.println(val);
		}
		
		
		
	}

}
