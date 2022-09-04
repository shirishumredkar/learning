import java.util.*;
public class ListInterComp {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		
		al.add("India");
		al.add("Germany");
		al.add("New Zealand");
		
		ll.add("India");
		ll.add("Germany");
		ll.add("New Zealand");
		
		ListInterComp lic = new ListInterComp();
		lic.printList(al);
		System.out.println("*********************************************");
		lic.printList(al);
		Collections.sort(al,null);
		System.out.println("*********************************************");
		lic.printList(al);
	}
	
	public void printList(List<String> list)
	{
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println("Element :"+iter.next());
		}
 	}

}
